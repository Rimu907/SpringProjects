package com.jt.controller;

import com.jt.service.FileService;
import com.jt.vo.ImageVO;
import com.jt.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.SortedMap;

/**
 * @Date:2021/12/15 15:50
 * @Author:NANDI_GUO
 */
@RestController
@CrossOrigin
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileService fileService;
    /*
    * post类型
    * file=字节信息
    * 返回值结果: SysResult(ImageVO)
    * 知识点:
    * SpringMVC针对与IO操作开发了MultipartFile
    * 底层实现就是常规Io流,简化了用户的操作过程,无需手动关流
    *
    * 1.获取文件名称
    * 2.准备文件路径
    * 3.准备文件上传的全路径
    * 4.实现文件上传的操作
    * */
//    @PostMapping("/upload")
//    public SysResult upload(MultipartFile file) throws Exception {
//        String fileName = file.getOriginalFilename();
//        String dir = "A:/SpringProjects/2109/images";
//        File dirFile = new File(dir);
//        if (!dirFile.exists()){
//            dirFile.mkdirs();
//        }
//        String path = dir +  "/" + fileName;
//        file.transferTo(new File(path));
//        return SysResult.success();
//    }
    @PostMapping("/upload")
    public SysResult upload(MultipartFile file) throws Exception {
        ImageVO imageVO = fileService.upload(file);
        if (imageVO == null){
            System.out.println("文件上传失败");
        }
        return SysResult.success(imageVO);
    }
}
