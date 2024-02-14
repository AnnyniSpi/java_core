package com.annynispi.javacore.chapter15;

public class LambdaDemo2 {
    public static void main(String[] args) {

        NumericTest isEven = (n) -> n % 2 == 0;
        
        if(isEven.test(10))
            System.out.println("Чиcлo 10 четное");
        if(!isEven.test(3))
            System.out.println("Чиcлo 3 нечетное");

        NumericTest isNonNeg = (n) -> n >= 0;

        if(isNonNeg.test(5))
            System.out.println("Чиcлo 5 неотрицательное");
        if(!isNonNeg.test(-8))
            System.out.println("Чиcлo 3 отрицательное");
    }
}

@FunctionalInterface
interface NumericTest{
    boolean test(int n);
}
