package com.example.effectivejava.item9.test;

public class Foo implements AutoCloseable {

    public void doSomething() {
        System.out.println("do something");
        throw new RuntimeException("do something exception");
    }

    @Override
    public void close() {
        System.out.println("close");
        throw new RuntimeException("close exception");
    }

}
