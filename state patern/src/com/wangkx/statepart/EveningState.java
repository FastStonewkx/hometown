package com.wangkx.statepart;

public class EveningState extends State {
    @Override
    public void WriteProgram(Work w) {
        if (w.getTaskFinish()) {
            w.setState(new RestState());
            w.writeProgram();
        } else {
            if (w.getHour() < 21) {
                System.out.println("当前时间：" + w.getHour() + "点 活没干完，加班继续，好累啊");
            } else {
                w.setState(new SleepState());
                w.writeProgram();
            }
        }
    }
}
