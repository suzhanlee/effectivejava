package com.example.effectivejava.item5.factorymethodpattern;

public class Main {

    public static void main(String[] args) {

        UserFactory userFactory1 = new NaverUserFactory();
        User user1 = userFactory1.createInstance();

        UserFactory userFactory2 = new KakaoUserFactory();
        User user2 = userFactory2.createInstance();
    }

}
