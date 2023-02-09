package com.jxd.manage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.manage.model.Admin;

import java.util.Map;

public interface IAdminDao extends BaseMapper<Admin> {
    Map<String, String> getAdminByUid(Integer uid);
}
