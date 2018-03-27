package com.designpatern.build;

public class Director {
    public void Construct(Builder  builder){
        builder.buildPartA();
        builder.buildPartB();
    }
    public static void main(String[] args){
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.Construct(b1);
        Product p1 = b1.GetResult();
        p1.show();

        director.Construct(b2);
        Product p2 = b2.GetResult();
        p2.show();


    }
}
