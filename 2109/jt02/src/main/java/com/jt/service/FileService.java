package com.jt.service;

import com.jt.vo.ImageVO;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Date:2021/12/15 16:47
 * @Author:NANDI_GUO
 */
public interface FileService {
    ImageVO upload(MultipartFile file);
}
