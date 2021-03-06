package com.designpatern.build;

public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
   public void buildPartA() {
        product.Add("部件A");
    }

    @Override
    public void buildPartB() {
        product.Add("部件B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
