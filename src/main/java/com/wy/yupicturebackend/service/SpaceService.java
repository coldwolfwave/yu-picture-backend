package com.wy.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wy.yupicturebackend.model.dto.space.SpaceAddRequest;
import com.wy.yupicturebackend.model.dto.space.SpaceQueryRequest;
import com.wy.yupicturebackend.model.entity.Space;
import com.wy.yupicturebackend.model.entity.User;
import com.wy.yupicturebackend.model.vo.SpaceVO;
import javax.servlet.http.HttpServletRequest;

/**
 * @author coldwolfwave
 * @description 针对表【space(空间)】的数据库操作Service
 */
public interface SpaceService extends IService<Space> {

    /**
     * 创建空间
     *
     * @param spaceAddRequest
     * @param loginUser
     * @return
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    /**
     * 校验空间
     *
     * @param space
     * @param add 是否为创建时校验
     */
    void validSpace(Space space, boolean add);


    /**
     * 获取查询对象
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);


    /**
     * 获取空间包装类（单个）
     *
     * @param request
     * @param space
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取空间包装类（分页）
     *
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    void fillSpaceBySpaceLevel(Space space);
}
