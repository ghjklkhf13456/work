package com.HJh.test.oop.xiaoxiangmu.zhinengjiaju;

public class JD implements Switch{
    private String name;
    private boolean status;

    @Override
    public void Press() {
        status = !status;
    }

    public JD() {
    }

    public JD(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
