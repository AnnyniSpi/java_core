package com.annynispi.javacore.chapter11;

public class Synch {
    public static void main(String[] args) throws InterruptedException {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Добро пожаловать ");
        Caller ob2 = new Caller(target, "в синхронизированный");
        Caller ob3 = new Caller(target, "мир!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Пpepвaнo");
        }
    }
}

class Callme{
    synchronized void call(String msg){
        System.out.print("[" + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Пpepвaнo ");
        }

        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) throws InterruptedException {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
        Thread.sleep(1000);
    }

    @Override
    public void run() {
        target.call(msg);
    }
}