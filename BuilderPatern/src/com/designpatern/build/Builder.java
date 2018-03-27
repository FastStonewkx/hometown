package com.designpatern.build;

public abstract class Builder {
    abstract void buildPartA();
    abstract void buildPartB();
    abstract Product GetResult();
}
