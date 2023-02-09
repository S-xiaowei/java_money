package com.jxd.manage.controller;
import com.jxd.manage.model.User;
import com.jxd.manage.service.ISelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName SelfController
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/2/4
 * @Version 1.0
 */
@RestController
public class SelfController {
    @Autowired
    private ISelfService selfService;

    @RequestMapping("/flagUname")
    public String flagUname(@RequestBody String uname) {
        uname=uname.replace("\"","").replace("\"","");
        if (selfService.selectUname(uname) == null) {//查用户名是否重复,为空代表没有一样的用户名
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping("/updUser")
    public String updUser(@RequestBody Map<String, String> map) {
        if (map.get("newPassword") != null && map.get("newPassword") != "") {
            User user = new User(map.get("uid"), map.get("uname"), map.get("oldPassword"));
            Integer uid = selfService.selectUser(user);
            if (uid == null) {
                return "errorPwd";
            } else {
                if (selfService.updUser(map)) {
                    return "success";
                } else {
                    return "error";
                }
            }
        }else {
            if (selfService.updUser(map)) {
                return "success";
            } else {
                return "error";
            }
        }
    }

    @Value("${file.address}")
    String address;
    @RequestMapping("/uploadImg")
    public String uploadImg(@RequestParam("image") MultipartFile upload ,@RequestParam("fileName") String fileName){
        ApplicationHome home = new ApplicationHome(getClass());
        //获取target
        File fileJar = home.getSource();
        //要上传到哪里
        String savePath = fileJar.getParent().toString() + address;
        File file = new File(savePath);
        //如果不存在或不是目录就创建，如果存在就不创建了
        if (file.exists()||!file.isDirectory()){
            file.mkdir();
        }
        //根据保存路径和新名字生成文件对象
        File saveFile = new File(savePath,fileName);
        try {
            //将springMVC接收到的文件对象，转换为普通的文件对象
            //转换的过程即保存的过程
            upload.transferTo(saveFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //返回文件保存路径及文件名
        return "success";
    }

}
