package com.example.effectivejava.item2.enumpractice;

public class FruitType extends Fruit{

    private String name;
    private int price;


    public FruitType(String name, int price) {
        super(name);
        this.name = name;
        this.price = price;
    }

    @Override
    int calculate() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
