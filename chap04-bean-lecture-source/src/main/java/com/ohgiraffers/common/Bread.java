package com.ohgiraffers.common;

import java.util.Date;

public class Bread extends Product {

    private Date backedDate;    // 만든 시간

    public Bread(){}
    public Bread(String name, int price, Date backedDate) {
        super(name, price);
        this.backedDate = backedDate;
    }

    public Date getBackedDate() {
        return backedDate;
    }

    public void setBackedDate(Date backedDate) {
        this.backedDate = backedDate;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.backedDate;
    }
}
