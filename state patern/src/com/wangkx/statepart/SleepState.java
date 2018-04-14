package com.wangkx.statepart;

public class SleepState extends State {

    @Override
    public void WriteProgram(Work w) {
        System.out.println("当前时间："+w.getHour()+"点 不行了，回家睡了");

    }
}
