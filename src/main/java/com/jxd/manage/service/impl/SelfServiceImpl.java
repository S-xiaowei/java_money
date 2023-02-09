package com.jxd.manage.service.impl;

import com.jxd.manage.dao.IUserDao;
import com.jxd.manage.model.User;
import com.jxd.manage.service.ISelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @ClassName SelfServiceImpl
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/2/4
 * @Version 1.0
 */
@Service
public class SelfServiceImpl implements ISelfService {
    @Autowired
    private IUserDao userDao;

    @Override
    public boolean updUser(Map<String,String> map) {
        return userDao.updUser(map);
    }

    @Override
    public Integer selectUname(String uname) {
        return userDao.selectUname(uname);
    }

    public Integer selectUser(User user){
        return userDao.selectUser(user);
    }

}
