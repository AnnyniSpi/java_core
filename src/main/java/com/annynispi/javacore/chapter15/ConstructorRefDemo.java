package com.annynispi.javacore.chapter15;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc4 myClassCons = MyClass2::new;

        MyClass2 mc = myClassCons.func(100);
        System.out.println("Знaчeниe val в объекте mc равно " + mc.getVal());
    }
}

class MyClass2{
    private int val;
    public MyClass2(int v) {
        val = v;
    }

    public MyClass2 () {
        val = 0;
    }

    public int getVal () {
        return val;
    }
}

interface MyFunc4{
    MyClass2 func(int n);
}
