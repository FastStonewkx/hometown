package com.designpatern.build;

public class ConcreteBuilder2 extends Builder{

    private Product product = new Product();

    @Override
    void buildPartA() {
        product.Add("部件X");
    }

    @Override
    void buildPartB() {
        product.Add("部件Y");
    }

    @Override
    Product GetResult() {
        return product;
    }
}
