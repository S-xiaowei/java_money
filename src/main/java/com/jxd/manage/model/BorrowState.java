package com.jxd.manage.model;

/**
 * @ClassName BorrowState
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/16
 * @Version 1.0
 */
public class BorrowState {
    private Integer  bsid;//借款状态id
    private String bsname;//借款状态名称

    public Integer getBsid() {
        return bsid;
    }

    public void setBsid(Integer  bsid) {
        this.bsid = bsid;
    }

    public String getBsname() {
        return bsname;
    }

    public void setBsname(String bsname) {
        this.bsname = bsname;
    }

    public BorrowState() {
    }

    public BorrowState(Integer bsid, String bsname) {
        this.bsid = bsid;
        this.bsname = bsname;
    }
}
