package com.annynispi.javacore.chapter15;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLambda = n -> {
            int v = num + n;
//            num++;
            return v;
        };
    }

}

interface MyFunc{
    int func(int n);
}