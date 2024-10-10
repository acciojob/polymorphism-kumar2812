package com.driver;

public class Main {
    // Task 1: Create a class Product inside Main class
    static class Product {
        // Task 3: Method to multiply two integers
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method to multiply three integers
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method to multiply two doubles
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create an object of Product
        Product p = new Product();

        // Calling the method with two integers
        int result1 = p.product(3, 4);
        System.out.println("Product of 3 and 4: " + result1);

        // Calling the overloaded method with three integers
        int result2 = p.product(2, 3, 5);
        System.out.println("Product of 2, 3, and 5: " + result2);

        // Calling the overloaded method with two doubles
        double result3 = p.product(2.5, 4.0);
        System.out.println("Product of 2.5 and 4.0: " + result3);
    }
}
