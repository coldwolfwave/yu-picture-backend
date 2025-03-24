package com.wy.yupicturebackend.controller;

import com.wy.yupicturebackend.annotation.AuthCheck;
import com.wy.yupicturebackend.common.BaseResponse;
import com.wy.yupicturebackend.common.ResultUtils;
import com.wy.yupicturebackend.constant.UserConstant;
import com.wy.yupicturebackend.model.dto.picture.PictureUploadRequest;
import com.wy.yupicturebackend.model.entity.User;
import com.wy.yupicturebackend.model.vo.PictureVO;
import com.wy.yupicturebackend.service.PictureService;
import com.wy.yupicturebackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/picture")
public class PictureController {
    @Resource
    private PictureService pictureService;
    @Resource
    private UserService userService;
    /**
     * 上传图片（可重新上传）
     */
    @PostMapping("/upload")
    @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
    public BaseResponse<PictureVO> uploadPicture(
            @RequestPart("file") MultipartFile multipartFile,
            PictureUploadRequest pictureUploadRequest,
            HttpServletRequest request) {
        User loginUser = userService.getLoginUser(request);
        PictureVO pictureVO = pictureService.uploadPicture(multipartFile, pictureUploadRequest, loginUser);
        return ResultUtils.success(pictureVO);
    }

}
