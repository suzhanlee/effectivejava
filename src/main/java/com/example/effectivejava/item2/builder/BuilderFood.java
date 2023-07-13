package com.example.effectivejava.item2.builder;

public class BuilderFood {

    private int servingSize = Integer.MIN_VALUE;  // 필수
    private int servings = Integer.MIN_VALUE;    // 필수
    private final int calories;
    private final int fat;

    public static class Builder {
        private final int servingSize;  // 필수
        private final int servings;    // 필수
        private int calories;
        private int fat;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        /**
         * 왜 return this를 해야 연쇄적으로 이어질 수 있는거지?
         * @param fat
         */
        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public BuilderFood build() {
            return new BuilderFood(this);
        }

    }

    public BuilderFood(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
    }

    @Override
    public String toString() {
        return "BuilderFood{" +
            "servingSize=" + servingSize +
            ", servings=" + servings +
            ", calories=" + calories +
            ", fat=" + fat +
            '}';
    }

    public static void main(String[] args) {

        BuilderFood food = new Builder(1, 2).calories(3).fat(4).build();
        System.out.println(food);
    }
}
