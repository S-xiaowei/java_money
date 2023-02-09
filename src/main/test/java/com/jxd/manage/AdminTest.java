package com.jxd.manage;

import com.jxd.manage.dao.IAdminDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName AdminTest
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/19
 * @Version 1.0
 */
@SpringBootTest
public class AdminTest {
    @Autowired
    IAdminDao IAdminDao;
    @Test
    public void getAdminByUid(){
        IAdminDao.getAdminByUid(1);
    }
}
