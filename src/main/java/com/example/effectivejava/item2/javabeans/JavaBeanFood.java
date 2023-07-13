package com.example.effectivejava.item2.javabeans;

public class JavaBeanFood {

    private int servingSize = Integer.MIN_VALUE;  // 필수
    private int servings = Integer.MIN_VALUE;    // 필수
    private int calories;
    private int fat;

    public JavaBeanFood() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "JavaBeanFood{" +
            "servingSize=" + servingSize +
            ", servings=" + servings +
            ", calories=" + calories +
            ", fat=" + fat +
            '}';
    }

    public static void main(String[] args) {
        JavaBeanFood javaBeanFood = new JavaBeanFood();
        javaBeanFood.setFat(1);
        javaBeanFood.setCalories(2);
        javaBeanFood.setServings(3);
        javaBeanFood.setServingSize(4);

        System.out.println(javaBeanFood);
    }


}
