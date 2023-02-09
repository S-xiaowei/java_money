package com.jxd.manage.model;

/**
 * @ClassName dept
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/16
 * @Version 1.0
 */
public class Dept {
    private Integer did;//部门编号
    private String dname;//部门名称

    public Dept(Integer did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public Dept() {
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
