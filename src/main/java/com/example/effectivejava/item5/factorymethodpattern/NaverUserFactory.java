package com.example.effectivejava.item5.factorymethodpattern;

public class NaverUserFactory extends UserFactory{

    @Override
    User getUser() {
        return new NaverUser();

    }
}
