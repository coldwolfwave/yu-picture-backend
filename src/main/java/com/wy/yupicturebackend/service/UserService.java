package com.wy.yupicturebackend.service;

import com.wy.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wy.yupicturebackend.model.vo.LoginUserVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author lenovo
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-03-16 20:37:46
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 获取加密密码
     * @param userPassword
     * @return 加密后的密码
     */
    String getEncryptPassword(String userPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 获取脱敏后的当前用户信息
     *
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);
}
