package com.example.effectivejava.item2.enumpractice;

abstract class CustomEnum<T extends CustomEnum> implements Comparable<T> {

    private final String name;
    private int ordinal;

    protected CustomEnum(String name) {
        this.name = name;
        this.ordinal++;
    }

    public String name() {
        return name;
    }

    public int ordinal() {
        return ordinal;
    }

    @Override
    public boolean equals(Object object) {
        return object == this;
    }

    @Override
    public int compareTo(T o) {
        if (this.getClass() != o.getClass()) {
            throw new ClassCastException();
        }

        return this.ordinal - o.ordinal();
    }
}