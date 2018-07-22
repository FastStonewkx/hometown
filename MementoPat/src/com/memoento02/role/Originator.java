package com.memoento02.role;



public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento CreateMemento(){
        Memento memento = new Memento();
        memento.setState(state);
        return  memento;
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }
    public void show(){
        System.out.println("State=" + state);
    }

}
