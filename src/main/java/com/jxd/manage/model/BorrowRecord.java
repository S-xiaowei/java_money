package com.jxd.manage.model;

/**
 * @ClassName borrow
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/16
 * @Version 1.0
 */
public class BorrowRecord {
    private int bid;//借款编号
    private String eid;//员工编号
    private String bmoney;//借款金额
    private String tid;//借款类型
    private String bsid;//借款状态
    private String breason;//借款原因
    private String btime;//借款时间
    private String bstillMoney;//借款仍需还款
    private String bbackReason;//审核不通过原因

    public BorrowRecord(int bid, String eid, String bmoney, String tid, String bsid, String breason, String btime, String bstillMoney, String bbackReason) {
        this.bid = bid;
        this.eid = eid;
        this.bmoney = bmoney;
        this.tid = tid;
        this.bsid = bsid;
        this.breason = breason;
        this.btime = btime;
        this.bstillMoney = bstillMoney;
        this.bbackReason = bbackReason;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBmoney() {
        return bmoney;
    }

    public void setBmoney(String bmoney) {
        this.bmoney = bmoney;
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

    public String getBreason() {
        return breason;
    }

    public void setBreason(String breason) {
        this.breason = breason;
    }

    public BorrowRecord() {
    }

    public BorrowRecord(int bid, String eid, String bmoney, String tid, String bsid, String breason, String btime, String bstillMoney) {
        this.bid = bid;
        this.eid = eid;
        this.bmoney = bmoney;
        this.tid = tid;
        this.bsid = bsid;
        this.breason = breason;
        this.btime = btime;
        this.bstillMoney = bstillMoney;
    }

    public String getBstillMoney() {
        return bstillMoney;
    }

    public void setBstillMoney(String bstillMoney) {
        this.bstillMoney = bstillMoney;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getBbackReason() {
        return bbackReason;
    }

    public void setBbackReason(String bbackReason) {
        this.bbackReason = bbackReason;
    }
}
