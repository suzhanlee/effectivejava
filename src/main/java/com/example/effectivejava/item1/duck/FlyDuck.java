package com.example.effectivejava.item1.duck;

public class FlyDuck implements Duck{

    private int weight;

    public FlyDuck(int weight) {
        this.weight = weight;
    }

    @Override
    public void fly() {
        System.out.println("fly");

    }
}
