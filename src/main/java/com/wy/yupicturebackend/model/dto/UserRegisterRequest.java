package com.wy.yupicturebackend.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求
 *
 * @author wy
 * @createTime 2023/09/01 09:02
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -937073782572840941L;
    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 校验密码
     */
    private String checkPassword;

}
