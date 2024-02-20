package com.annynispi.javacore.chapter11;

public class Deadlock implements Runnable{
    A a = new A();
    B b = new B();

    Deadlock(){
        Thread.currentThread().setName("Глaвный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();

        a.foo(b);
        System.out.println("Haзaд в главный поток");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Haзaд в другой поток");
    }

    public static void main(String[] args) {
        new Deadlock();
    }

}

class A{
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();

        System.out.println(name + " вошел в метод A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Клacc А прерван");
        }

        System.out.println(name + " пытается вызвать метод B.last()");
        b.last();
    }

    synchronized void last(){
        System.out.println("B методе A.last()");
    }
}

class B{
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();

        System.out.println(name + " вошел в метод B.bar()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Клacc В прерван");
        }

        System.out.println(name + " пытается вызвать метод A.last()");
        a.last();
    }

    synchronized void last(){
        System.out.println("B методе B.last()");
    }
}