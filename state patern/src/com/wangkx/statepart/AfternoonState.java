package com.wangkx.statepart;

public class AfternoonState extends State {
    @Override
    public void WriteProgram(Work w) {
        if (w.getHour() < 17) {
            System.out.println("当前时间：" + w.getHour() + "点下午状态还不错，继续努力o");
        } else{
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
