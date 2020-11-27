package com.wcy.rhapsody.admin.mapper.api;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wcy.rhapsody.admin.modules.entity.web.User;
import org.mapstruct.Mapper;

/**
 * 用户
 *
 * @author Yeeep 2020/11/7
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}