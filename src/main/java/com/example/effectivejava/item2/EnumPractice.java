package com.example.effectivejava.item2;

import com.example.effectivejava.item2.realenum.Fruit;

public class EnumPractice {

    public static void main(String[] args) {

        Fruit apple = Fruit.APPLE;
        System.out.println(apple);

        int totalPrice = apple.calculateTotalPrice(3);
        System.out.println("totalPrice = " + totalPrice);
    }

}
