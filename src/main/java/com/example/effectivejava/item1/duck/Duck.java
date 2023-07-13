package com.example.effectivejava.item1.duck;

public interface Duck {

    int weight = 3;
    void fly();

    static Duck createFlyDuck() {
        return new FlyDuck(weight);
    }

    static Duck createFakeDuck(int weight) {
        return new FakeDuck(weight);
    }

}
