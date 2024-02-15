package com.annynispi.javacore.chapter15;

public class MethodRefDemo{
    static String stringOp(StringFunc2 stringFunc2, String s){
        return stringFunc2.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда- выражения повышают эффективность Java ";
        String outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Иcxoднaя строка : "+ inStr);
        System.out.println("Oбpaщeннaя строка : "+ outStr);
    }
}

class MyStringOps {
    public static String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

interface StringFunc2{
    String func(String n);
}