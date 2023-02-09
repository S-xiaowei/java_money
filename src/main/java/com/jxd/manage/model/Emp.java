package com.jxd.manage.model;

/**
 * @ClassName emp
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/16
 * @Version 1.0
 */
public class Emp {
    private String eid;//员工编号
    private String ename;//员工名称
    private String sex;//员工性别
    private String job;//职位
    private String hiredate;//入职日期
    private String did;//部门名称
    private String uid;//用户编号

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public Emp(String eid, String ename, String sex, String job, String hiredate, String did) {
        this.eid = eid;
        this.ename = ename;
        this.sex = sex;
        this.job = job;
        this.hiredate = hiredate;
        this.did = did;
    }

    public Emp(String eid, String ename, String sex, String job, String hiredate, String did,String uid) {
        this.eid = eid;
        this.ename = ename;
        this.sex = sex;
        this.job = job;
        this.hiredate = hiredate;
        this.did = did;
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Emp() {
    }
}
