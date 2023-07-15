package com.example.effectivejava.item5.factorymethodpattern;

public class KakaoUserFactory extends UserFactory{

    @Override
    User getUser() {
        return new KakaoUser();
    }
}
