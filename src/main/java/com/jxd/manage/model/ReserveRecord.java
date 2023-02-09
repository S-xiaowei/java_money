package com.jxd.manage.model;

/**
 * @ClassName reserve
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/16
 * @Version 1.0
 */
public class ReserveRecord {
    private int rid;//还款编号
    private String bid;//借款编号
    private String rsid;//还款状态
    private String rmoney;//本次还款金额
    private String rbackReason;//还款审核不通过原因

    private String rtime;//还款时间

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
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

    public ReserveRecord() {
    }

    public ReserveRecord(int rid, String bid, String rsid,  String rmoney, String rtime) {
        this.rid = rid;
        this.bid = bid;
        this.rsid = rsid;
        this.rmoney = rmoney;
        this.rtime = rtime;
    }

    public String getRbackReason() {
        return rbackReason;
    }

    public void setRbackReason(String rbackReason) {
        this.rbackReason = rbackReason;
    }

    public ReserveRecord(int rid, String bid, String rsid, String rmoney, String rbackReason, String rtime) {
        this.rid = rid;
        this.bid = bid;
        this.rsid = rsid;
        this.rmoney = rmoney;
        this.rbackReason = rbackReason;
        this.rtime = rtime;
    }

    public String getRmoney() {
        return rmoney;
    }

    public void setRmoney(String rmoney) {
        this.rmoney = rmoney;
    }

    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime;
    }

}
