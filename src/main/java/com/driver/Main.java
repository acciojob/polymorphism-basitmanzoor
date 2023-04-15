package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int product1 = p.product(2, 3);
        int product2 = p.product(2, 3, 4);
        double product3 = p.product(2.5, 3.5);
        System.out.println("Product 1: " + product1);
        System.out.println("Product 2: " + product2);
        System.out.println("Product 3: " + product3);
    }
    public static class Product {

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }

    }

}