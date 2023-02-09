package com.jxd.manage.model;

/**
 * @ClassName type
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/1/16
 * @Version 1.0
 */
public class BorrowType {
    private Integer tid;//借款类型id
    private String tname;//借款类型名称

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public BorrowType(Integer  tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public BorrowType() {
    }
}
