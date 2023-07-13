package com.example.effectivejava.item1;

public class Coin {

    private static final Coin HEAD = new Coin(1);
    private static final Coin TAIL = new Coin(0);

    private int number;

    private Coin(int number) {
        this.number = number;
    }

    /**
     * 호출할 때마다 인스턴스를 새로 생성하지 않아도 된다.
     */
    public static Coin valueOf(int number) {
        if (number == 1) {
            return HEAD;
        }
        return TAIL;
    }


}
