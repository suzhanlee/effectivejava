package com.example.effectivejava.item9.test;

public class TryFinallyTest {

    public static void main(String[] args) {

        Foo foo1 = new Foo();
        try {
            foo1.doSomething();
            Foo foo2 = null;
            try {
                foo2 = new Foo();
                foo2.doSomething();
            } finally {
                assert foo2 != null;
                foo2.close();
            }
        } finally {
            foo1.close();
        }
    }

}
