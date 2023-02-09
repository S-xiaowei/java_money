package com.jxd.manage.ds;

/**
 * @ClassName ManageDateSet
 * @Description TODO
 * @Author sunxiaowei
 * @Date 2023/2/1
 * @Version 1.0
 */
public class ManageDateSet {
    private String id;//查询的编号
    private String name;//查询的名称
    private String did;//查询员工时候的查询条件部门编号

    public ManageDateSet(String id, String name, String did) {
        this.id = id;
        this.name = name;
        this.did = did;
    }

    public ManageDateSet() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }
}
