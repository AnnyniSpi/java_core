package com.annynispi.javacore.chapter15;


public class LambdaDemo {
    public static void main(String[] args) {

        MyNumber number;

        number = () -> 123.45;

        System.out.println("Cлyчaйнoe значение : " + number.getValue());

        number = () -> Math.random() * 100;

        System.out.println("Cлyчaйнoe значение : " + number.getValue());
        System.out.println("Еще одно случайное значение : " + number.getValue());

    }
}

@FunctionalInterface
interface MyNumber {
    double getValue();
}
