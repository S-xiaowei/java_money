package com.jxd.manage.model;

/**
 * @ClassName ReserveState
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/16
 * @Version 1.0
 */
public class ReserveState {
    private Integer rsid;//还款状态id
    private String rsname;//还款状态名称

    public Integer getRsid() {
        return rsid;
    }

    public void setRsid(Integer rsid) {
        this.rsid = rsid;
    }

    public String getRsname() {
        return rsname;
    }

    public void setRsname(String rsname) {
        this.rsname = rsname;
    }

    public ReserveState() {
    }

    public ReserveState(Integer rsid, String rsname) {
        this.rsid = rsid;
        this.rsname = rsname;
    }
}
