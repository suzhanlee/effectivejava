package com.example.effectivejava.item2.realenum;

public enum Fruit {

    APPLE(1000) {
        @Override
        public int calculateTotalPrice(int number) {
            return super.price * number;
        }
    },
    BANANA(500) {
        @Override
        public int calculateTotalPrice(int number) {
            return super.price * number;
        }
    },
    CHERRY(100) {
        @Override
        public int calculateTotalPrice(int number) {
            return super.price * number;
        }
    },
    SALEAPPLE(1000) {
        @Override
        public int calculateTotalPrice(int number) {
            int salePercent = 50;
            return (int) ((super.price * number) * salePercent/100);
        }
    };

    private int price;

    private Fruit(int price) {
        this.price = price;

    }

    abstract public int calculateTotalPrice(int number);

    public static void main(String[] args) {
        int price1 = Fruit.APPLE.price;
        System.out.println("price1 = " + price1);
        int totalPrice = Fruit.APPLE.calculateTotalPrice(3);
        System.out.println("totalPrice = " + totalPrice);

        Fruit saleapple = Fruit.SALEAPPLE;
        int saleTotalPrice = saleapple.calculateTotalPrice(3);
        System.out.println("saleTotalPrice = " + saleTotalPrice);

//        Fruit fruit = new Fruit(30) {
//            @Override
//            int calculateTotalPrice(int number) {
//                return 0;
//            }
//        };
    }


}
