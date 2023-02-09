package com.jxd.manage.model;

/**
 * @ClassName admin
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/16
 * @Version 1.0
 */
public class Admin {
    private int aid;//管理员id
    private String aname;//管理员名称

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Admin(int aid, String aname) {
        this.aid = aid;
        this.aname = aname;
    }

    public Admin() {
    }
}
