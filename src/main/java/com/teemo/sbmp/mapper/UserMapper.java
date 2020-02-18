package com.teemo.sbmp.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.teemo.sbmp.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author teemo
 * @since 2020-02-16
 */
public interface UserMapper extends BaseMapper<User> {

    //全部查询
    List<User> fillByPage();

    //分页查询
    List<User> fillByPage2(Page<User> page);
}
