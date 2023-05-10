package com.driver;

public class Main {
    public static void main(String[] args){
        Product ob=new Product();
        int prod1=ob.multiply(1,2);
      System.out.println("Product of two integer value:" + prod1);
        double prod2=ob.multiply(1.2,2.4,3.5);
        System.out.println("Product of three integer value:" + prod2);
    }

}