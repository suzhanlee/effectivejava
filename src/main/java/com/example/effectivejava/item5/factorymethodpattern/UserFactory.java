package com.example.effectivejava.item5.factorymethodpattern;

public abstract class UserFactory {

    public User createInstance() {
        User user = getUser();
        user.signUp();
        return user;
    }

    abstract User getUser();

}
