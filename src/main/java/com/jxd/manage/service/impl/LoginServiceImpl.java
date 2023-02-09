package com.jxd.manage.service.impl;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.manage.dao.IAdminDao;
import com.jxd.manage.dao.IEmpDao;
import com.jxd.manage.dao.IUserDao;
import com.jxd.manage.ds.ManageDateSet;
import com.jxd.manage.model.User;
import com.jxd.manage.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName LoginServiceImpl
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/20
 * @Version 1.0
 */
@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private IUserDao userDao;
    @Autowired
    IAdminDao adminDao;
    @Autowired
    IEmpDao empDao;

    @Override
    public Integer login(User user) {
        return userDao.getUId(user);
    }
    @Override
    public Map<String, String> getAdminByUid(Integer uid) {
        return adminDao.getAdminByUid(uid);
    }

    @Override
    public Map<String,String> getEmpByUid(Integer uid) {
        return empDao.getEmpByUid(uid);
    }



}
