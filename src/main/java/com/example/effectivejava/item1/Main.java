package com.example.effectivejava.item1;

import com.example.effectivejava.item1.duck.Duck;
import java.math.BigInteger;
import java.util.EnumSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Boolean flag = Boolean.valueOf(true);

        Coin coin = Coin.valueOf(1);

        System.out.println(coin);

        BigInteger bigInteger = BigInteger.valueOf(Integer.MAX_VALUE);

        int weight = 3;

        Duck.createFlyDuck().fly();
        Duck.createFakeDuck(weight).fly();

    }

}
