package com.annynispi.javacore.chapter10;

public class Ехс2 {

    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println(" Этo не будет выведено .") ;
        } catch (ArithmeticException e){
            System.out.println("Дeлeниe на нуль.") ;
        }
        System.out.println("Пocлe оператора catch.") ;
    }
}
