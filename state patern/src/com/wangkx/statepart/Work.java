package com.wangkx.statepart;

public class Work {
    private State current;
    private double hour;
    private boolean taskfinish;


    public Work() {
        current = new ForenoonState();
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void setState(State s) {
        current = s;
    }

    public boolean getTaskFinish() {
        return taskfinish;
    }

    public void setTaskfinish(boolean taskfinish) {
        this.taskfinish = taskfinish;
    }

    public void writeProgram() {
        current.WriteProgram(this);
    }
}
