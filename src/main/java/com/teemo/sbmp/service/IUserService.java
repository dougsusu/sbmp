package com.teemo.sbmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.teemo.sbmp.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author teemo
 * @since 2020-02-16
 */
public interface IUserService extends IService<User> {

    List<User> selectPage();
    List<User> selectPage2(Page<User> page);


}
