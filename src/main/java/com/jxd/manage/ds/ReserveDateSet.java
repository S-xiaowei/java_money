package com.jxd.manage.ds;

/**
 * @ClassName ReserveDateSet
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/23
 * @Version 1.0
 */
public class ReserveDateSet {
    private String bid;//还款编号
    private String rsid;//还款状态
    private String rtime;//还款时间
    private String eid;//借款人id
    private String did;//部门编号

    public ReserveDateSet(String bid, String rsid, String rtime, String eid) {
        this.bid = bid;
        this.rsid = rsid;
        this.rtime = rtime;
        this.eid = eid;
    }

    public ReserveDateSet() {
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

    public String getRsid() {
        return rsid;
    }

    public void setRsid(String rsid) {
        this.rsid = rsid;
    }

    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime;
    }

    public ReserveDateSet(String bid, String rsid, String rtime, String eid, String did) {
        this.bid = bid;
        this.rsid = rsid;
        this.rtime = rtime;
        this.eid = eid;
        this.did = did;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }
}