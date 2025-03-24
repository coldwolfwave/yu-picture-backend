package com.wy.yupicturebackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wy.yupicturebackend.model.dto.picture.PictureUploadRequest;
import com.wy.yupicturebackend.model.entity.Picture;
import com.wy.yupicturebackend.model.entity.User;
import com.wy.yupicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

/**
* @author lenovo
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-03-20 19:48:47
*/
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

}
