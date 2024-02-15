package com.annynispi.javacore.chapter15;

public class ConstructorRefDemoЗ {
    static <R,T> R myClassFactory(MyFunc5<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc5<SimpleClass<Double>, Double> myClassCons = SimpleClass::new;
        SimpleClass<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        MyFunc5<SimpleClass2 , String> myClassCons2 = SimpleClass2::new;
        SimpleClass2 mc2 = myClassFactory(myClassCons2, "Лямбда ");
        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal());
    }
}

class SimpleClass<T>{
    private T val;

    public SimpleClass(T val) {
        this.val = val;
    }

    public SimpleClass() {
        this.val = null;
    }

    public T getVal() {
        return val;
    }
}

class SimpleClass2<T>{
    private String str;

    public SimpleClass2(String str) {
        this.str = str;
    }

    public SimpleClass2() {
        this.str = "";
    }

    public String getVal() {
        return str;
    }
}


interface MyFunc5<R, T>{
    R func(T n);
}