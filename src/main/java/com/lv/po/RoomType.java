package com.lv.po;

import java.math.BigDecimal;

public class RoomType {
    private Integer id;

    private String name;

    private Integer badnum;

    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBadnum() {
        return badnum;
    }

    public void setBadnum(Integer badnum) {
        this.badnum = badnum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}