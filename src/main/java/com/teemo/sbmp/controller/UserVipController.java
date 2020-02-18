package com.teemo.sbmp.controller;


import com.teemo.sbmp.entity.User;
import com.teemo.sbmp.entity.UserVip;
import com.teemo.sbmp.service.IUserService;
import com.teemo.sbmp.service.IUserVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/vip")
public class UserVipController {

    @Autowired
    private IUserVipService userVipService;
    /**
     * 获取所有User
     * @return
     */
    @RequestMapping("/all")
    public List<UserVip> getAllUser(){
        List<UserVip> list = userVipService.list();
        return list;
    }

}
