package com.proxymodel.exam;

public class Pursuit implements GiveGift {

    SchoolGirl mm;
    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }
    @Override
    public void GiveDolls() {
        System.out.println(mm.Name + ",送给你洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(mm.Name + ",送给你鲜花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(mm.Name + ",送给你巧克力");
    }
}
