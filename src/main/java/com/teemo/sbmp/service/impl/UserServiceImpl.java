package com.teemo.sbmp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.teemo.sbmp.controller.UserController;
import com.teemo.sbmp.entity.User;
import com.teemo.sbmp.mapper.UserMapper;
import com.teemo.sbmp.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author teemo
 * @since 2020-02-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectPage() {
        List<User> users = userMapper.fillByPage();
        logger.debug("查询到的用户包含:{}",users.toString());
        logger.info("查询到的用户包含:{}",users.toString());
        return users;
    }

    @Override
    public List<User> selectPage2(Page<User> page) {
        return userMapper.fillByPage2(page);
    }
}
