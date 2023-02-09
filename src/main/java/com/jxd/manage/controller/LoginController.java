package com.jxd.manage.controller;

import com.jxd.manage.model.User;
import com.jxd.manage.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/20
 * @Version 1.0
 */
@RestController
public class LoginController {
    @Autowired
    private ILoginService userService;

    @RequestMapping("/login")
    public List<Object> login(@RequestBody User user) {
        Integer uid = userService.login(user);//登录获取uid
        List<Object> list = new ArrayList<>();
        Map<String, String> map;
        //用户的uid为1的时候是管理员
        if (uid==null){
            return list;
        }else if (uid==1){
             map = userService.getAdminByUid(uid);
             list.add(map);
        }else if (uid!=1&&uid!=null){
             map = userService.getEmpByUid(uid);
             list.add(map);
        }
        return list;
    }
}
