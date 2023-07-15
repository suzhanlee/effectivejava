package com.example.effectivejava.item5.factorymethodpattern;

public class KakaoUser implements User{

    @Override
    public void signUp() {
        System.out.println("kakao user 생성");
    }
}
