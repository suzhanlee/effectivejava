package com.example.effectivejava.item2.enumpractice;

public abstract class Fruit extends CustomEnum{

    public static final Fruit APPLE = new FruitType("사과",1000);
    public static final Fruit BANANA = new FruitType("바나나",500);
    public static final Fruit PINEAPPLE = new FruitType("파인애플",3000);


    private int price;

    protected Fruit(String name) {
        super(name);
    }

//    public Fruit(String name, int price) {
//        super(name);
//        this.price = price;
//    }

    abstract int calculate();

    public static void main(String[] args) {

    }
}
