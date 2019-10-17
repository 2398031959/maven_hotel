package com.lv.po;

public class Room {
    private Integer id;

    private String describe;

    private Integer typeId;

    private Integer statusId;

    private Integer intonum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getIntonum() {
        return intonum;
    }

    public void setIntonum(Integer intonum) {
        this.intonum = intonum;
    }
}