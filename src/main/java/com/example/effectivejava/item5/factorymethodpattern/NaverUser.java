package com.example.effectivejava.item5.factorymethodpattern;

public class NaverUser implements User{

    @Override
    public void signUp() {
        System.out.println("naver user 생성");
    }
}
