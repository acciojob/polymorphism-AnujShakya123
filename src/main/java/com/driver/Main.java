package com.driver;

public class Main {
    public static void main(String[] args){
        Product p = new Product();
        int productXY = p.product(10, 20);
        System.out.println(productXY);

        int productXYZ = p.product(10, 20, 30);
        System.out.println(productXYZ);

        double product_XY = p.product(10.5, 20.5);
        System.out.println(product_XY);

    }
}