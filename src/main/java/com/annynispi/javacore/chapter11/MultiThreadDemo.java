package com.annynispi.javacore.chapter11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread3("One");
        new NewThread3("Two");
        new NewThread3("Three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }

        System.out.println("Глaвный поток завершен.");
    }
}

class NewThread3 implements Runnable{
    String name;
    Thread t;

    NewThread3(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println( "Hoвый поток : "+ t );
        t.start();
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : "+ i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
}
