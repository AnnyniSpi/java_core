package com.annynispi.javacore.chapter13;

public class AssertDemo {

    public static int val = 3;

    public static int getnum(){
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getnum();

            assert n > 0;

            System.out.println("n равно " + n);
        }
    }
}
