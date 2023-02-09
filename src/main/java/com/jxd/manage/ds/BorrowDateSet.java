package com.jxd.manage.ds;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.manage.model.BorrowRecord;
import com.jxd.manage.model.Emp;

/**
 * @ClassName BorrowDateSet
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/23
 * @Version 1.0
 */
public class BorrowDateSet {
    private String bid;//借款编号
    private String tid;//借款类型
    private String bsid;//借款状态
    private String btime;//借款时间
    private String eid;//员工编号，管理员根据员工编号删除借款记录
    private String did;//部门编号

    public BorrowDateSet(String bid, String tid, String bsid, String btime, String eid, String did) {
        this.bid = bid;
        this.tid = tid;
        this.bsid = bsid;
        this.btime = btime;
        this.eid = eid;
        this.did = did;
    }

    public BorrowDateSet(String bid, String tid, String bsid, String btime, String eid) {
        this.bid = bid;
        this.tid = tid;
        this.bsid = bsid;
        this.btime = btime;
        this.eid = eid;
    }

    public BorrowDateSet() {
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getBsid() {
        return bsid;
    }

    public void setBsid(String bsid) {
        this.bsid = bsid;
    }

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }
}
