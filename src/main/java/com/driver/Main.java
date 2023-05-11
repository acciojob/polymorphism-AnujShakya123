package com.driver;

public class Main {
    public static void main(String[] args){
        Product p = new Product();
        int res1 = p.product(2, 3);
        int res2 = p.product(2, 3, 4);
        double res3 = p.product(2.5, 3.5);
        System.out.println("Result1: " + res1);
        System.out.println("Result2: " + res2);
        System.out.println("Result3: " + res3);
    }
}