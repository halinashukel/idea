package com.unicorn.Exception;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        System.out.println("Жизнь начинается!");
//        System.out.println(a/b);
        try {
            int c = a/b;
            System.out.println(c+b);
        }catch (ArithmeticException c){
            System.out.println("На 0 делить нельзя!");
        }finally {

        }
        System.out.println("Жизнь продолжается!");

    }

}
