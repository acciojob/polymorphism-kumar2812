package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p =new Product();
        System.out.println( p.product(56,32));
        System.out.println(p.product(23,14,16));
        System.out.println(p.product(33.56,23.45));

    }

    public static class Product {
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
}
