package com.jxd.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName BorrowApplication
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/16
 * @Version 1.0
 */

 @SpringBootApplication
 @MapperScan("com.jxd.manage.dao")
     public class BorrowApplication {
         public static void main(String[] args) {
             SpringApplication.run(BorrowApplication.class);
         }
 }
