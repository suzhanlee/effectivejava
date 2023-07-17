package com.example.effectivejava.item9.test;

public class TryWithResourcesTest {

    public static void main(String[] args) {

        try (Foo foo1 = new Foo(); Foo foo2 = new Foo()) {
            foo1.doSomething();
            foo2.doSomething();
        }
    }
}
