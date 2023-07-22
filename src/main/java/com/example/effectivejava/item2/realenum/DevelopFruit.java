package com.example.effectivejava.item2.realenum;

import java.util.function.Function;

public enum DevelopFruit {

    DEVELOP_APPLE(1000, new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer number) {

            return DEVELOP_APPLE.price * number;
        }
    });

    public int price;
    public Function<Integer, Integer> function;


    DevelopFruit(int price, Function<Integer, Integer> function ) {
        this.price = price;
        this.function = function;

    }

    public static void main(String[] args) {
        Integer totalPrice = DEVELOP_APPLE.function.apply(3);
        System.out.println("totalPrice = " + totalPrice);

    }


}
