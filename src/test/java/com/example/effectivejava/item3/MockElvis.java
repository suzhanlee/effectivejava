package com.example.effectivejava.item3;

public class MockElvis implements IElvis {
    @Override
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    @Override
    public void sing() {
        System.out.println("sing~~");
    }
}
