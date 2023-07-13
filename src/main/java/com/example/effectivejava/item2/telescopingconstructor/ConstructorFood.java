package com.example.effectivejava.item2.telescopingconstructor;

public class ConstructorFood {
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public ConstructorFood(int calories, int fat, int sodium, int carbohydrate) {
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public ConstructorFood(int calories, int fat, int sodium) {
        this(calories, fat, sodium, 0);
    }

    public ConstructorFood(int calories, int fat) {
        this(calories, fat, 0);
    }

    public ConstructorFood(int calories) {
        this(calories, 0);
    }

    @Override
    public String toString() {
        return "Food{" +
            "calories=" + calories +
            ", fat=" + fat +
            ", sodium=" + sodium +
            ", carbohydrate=" + carbohydrate +
            '}';
    }

    public static void main(String[] args) {
        ConstructorFood constructorFood = new ConstructorFood(1, 2);
        System.out.println(constructorFood);
    }





}
