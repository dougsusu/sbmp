package com.teemo.sbmp.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.teemo.sbmp.entity.User;
import com.teemo.sbmp.service.IUserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author teemo
 * @since 2020-02-16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);




    @Autowired
    private IUserService userService;
    /**
     * 获取所有User
     * @return
     */
    @RequestMapping("/all")
    public List<User> getAll(){
        List<User> list = userService.list();

        return list;
    }

    /**
     * 普通查询
     * @return
     */
    @RequestMapping("/page")
    public List<User> getAllPageUser(){
        List<User> userIPage = userService.selectPage();
        logger.debug("查询到的用户包含:{}",userIPage.toString());
        logger.info("查询到的用户包含:{}",userIPage.toString());
        return userIPage;
    }

    /**
     * 分页获取
     * @return
     */
    @RequestMapping("/page2")
    public List<User> getAllPageUser2(long current,long size){
        if(current == 0){
            current = 1;
        }
        if(size == 0){
            size = 1;
        }
        Page<User> page = new Page<>(current, size);
        List<User> userIPage = userService.selectPage2(page);
        return userIPage;
    }


}
