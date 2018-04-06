package com.wangkx.propertype_2;

public class WorkExperience implements Cloneable{
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Object Clone(){
        Object clone = null;
        try {
            clone = (Object)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
