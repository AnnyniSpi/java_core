package com.annynispi.javacore.chapter15;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = str -> {
            String result = "";

            for (int j = str.length() - 1; j >= 0; j--) {
                result += str.charAt(j);
            }
          return result;
        };

        System.out.println("Лямбдa обращается на " + reverse.func( "Лямбда "));
        System.out.println("Bыpaжeниe обращается на " + reverse.func( "Выражение "));
    }
}

@FunctionalInterface
interface StringFunc{
    String func(String n);
}