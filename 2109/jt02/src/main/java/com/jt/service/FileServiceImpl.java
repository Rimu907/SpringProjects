package com.jt.service;

import com.jt.vo.ImageVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import  java.util.Date;

/**
 * @Date:2021/12/15 16:47
 * @Author:NANDI_GUO
 */
@Service
public class FileServiceImpl implements FileService{
    //private String rootDir = "A:/SpringProjects/2109/images";
    private String rootDir = "/usr/local/src/images";
    private String rootURL = "http://image.jt.com";

    /*
    * 1.校验文件是否为图片             检验图片类型
    * 2.检测文件是否为恶意文件.exe     木马.exe.jpg
    * 3.分目录存储                    按照时间维度划分
    * 4.防止文件重名                  UUID
    * */
    @Override
    @Transactional
    public ImageVO upload(MultipartFile file) {
        String fileName = file.getOriginalFilename().toLowerCase();
        //String type = fileName.split(".")[1];
        String regex = "^.+\\.(jpg|gif|png)$";
        if(!fileName.matches(regex)){
            return null;
        }
        try {
            BufferedImage image = ImageIO.read(file.getInputStream());
            int width = image.getWidth();
            int height = image.getHeight();
            if(width == 0 || height == 0){
                return null;
            }
            String datePath = new SimpleDateFormat("/yyyy-MM-dd/").format(new Date());//时间
            String localDir = rootDir + datePath;//本地文件目录+时间 = 新文件夹目录按时间创建

            File dirFile = new File(localDir);
            if(!dirFile.exists()){
                dirFile.mkdirs();
            }
            String UUID = java.util.UUID.randomUUID().toString();
            int index = fileName.lastIndexOf(".");
            String fileType = fileName.substring(index);
            fileName = UUID+fileType;

            String path = localDir + fileName; //文件全路径=文件夹目录+文件名带后缀
            file.transferTo(new File(path));
            //准备imageVO的返回值
            String virtualPath = datePath + fileName; //固定的不写, 只有日期+文件名的目录
            //String urlPath = "https://img10.360buyimg.com/n1/s450x450_jfs/t1/158592/3/27420/127423/618e2b17E8e1287a4/c81b24748d130667.jpg";
            String urlPath = rootURL + virtualPath;
            System.out.println(urlPath);
            ImageVO imageVO = new ImageVO(virtualPath, urlPath,fileName);
            return imageVO;

        } catch (Exception e) {
            e.printStackTrace();
            //将检测异常转为运行时异常
            throw new RuntimeException(e);
        }
    }

    @Override
    @Transactional
    public void deleteFile(String virtualPath) {
        String localPath = rootDir + virtualPath;
        File file = new File(localPath);
        if(file.exists()){
            file.delete();
        }
    }
}
