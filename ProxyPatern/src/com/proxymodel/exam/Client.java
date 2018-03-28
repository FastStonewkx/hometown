package com.proxymodel.exam;

public class Client {
    public static void main(String[] args){
        SchoolGirl mm = new SchoolGirl();
        mm.Name = "李娇娇";
        Proxy daili = new Proxy(mm);

        daili.GiveDolls();
        daili.GiveFlowers();
        daili.GiveChocolate();

        System.out.println();
    }
}
