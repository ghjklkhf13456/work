package com.HJh.test.oop.xiaoxiangmu.zhinengjiaju;

public class SmartHomeSyetem {
    private static final SmartHomeSyetem smarthomesyetem = new SmartHomeSyetem();
    private SmartHomeSyetem(){}
    public static SmartHomeSyetem getInstance(){
        return smarthomesyetem;
    }
    public void control(JD jd){
        System.out.println("当前设备："+jd.getName()+"\t状态："+(jd.isStatus()?"开着":"关着"));
        System.out.println("进行操作中");
        jd.Press();
        System.out.println("当前设备："+jd.getName()+"\t状态："+(jd.isStatus()?"开着":"关着"));
    }
    public void showStatus(JD[] jd){
        for (int i = 0; i < jd.length; i++) {
            System.out.println("设备"+(i+1)+"："+jd[i].getName()+"\t\t状态："+(jd[i].isStatus()?"开着":"关着"));
        }
    }
}
