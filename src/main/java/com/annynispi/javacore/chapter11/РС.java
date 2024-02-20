package com.annynispi.javacore.chapter11;

public class РС {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}

class Q{
    int n;

    synchronized int get(){
        System.out.println("Пoлyчeнo : "+ n);
        return n;
    }

    synchronized void put(int n){
        this.n = n;
        System.out.println("Oтпpaвлeнo : " + n);
    }
}

class Producer implements Runnable{
    Q q;

    Producer(Q q){
        this.q = q;
        new Thread(this, " Поставщик").start();
    }

    @Override
    public void run() {
        int i = 0;

        while (true){
            q.put(i++);
        }
    }
}

class Consumer implements Runnable{
    Q q;

    Consumer(Q q){
        this.q = q;
        new Thread(this, " Потребитель ").start();
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}