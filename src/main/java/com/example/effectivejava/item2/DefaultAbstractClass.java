package com.example.effectivejava.item2;

public class DefaultAbstractClass {

    int num;
    String name;

    public DefaultAbstractClass(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public static void main(String[] args) {
        DefaultAbstractClass abstractClass = new DefaultAbstractClass(1,"추상클래스") {
          public void generate() {
              System.out.println("하위 클래스");
          }
        };
    }
}
