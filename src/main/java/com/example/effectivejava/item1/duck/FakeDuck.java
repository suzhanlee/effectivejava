package com.example.effectivejava.item1.duck;

public class FakeDuck implements Duck{

    private int weight;

    public FakeDuck(int weight) {
        this.weight = weight;
    }

    @Override
    public void fly() {
        System.out.println("can't fly");

    }
}
