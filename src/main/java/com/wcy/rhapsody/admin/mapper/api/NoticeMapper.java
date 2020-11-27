package com.wcy.rhapsody.admin.mapper.api;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wcy.rhapsody.admin.modules.entity.web.Notice;
import org.mapstruct.Mapper;

/**
 * 公告
 *
 * @author Yeeep 2020/11/19
 */
@Mapper
public interface NoticeMapper extends BaseMapper<Notice> {
}