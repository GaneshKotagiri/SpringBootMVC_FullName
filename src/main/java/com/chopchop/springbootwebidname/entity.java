package com.chopchop.springbootwebidname;

public class entity {
    private String fname;
    private String sname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    @Override
    public String toString() {
        return "entity{" +
                "fname='" + fname + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
