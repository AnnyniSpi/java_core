package com.annynispi.javacore.chapter11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("One");
        NewThread4 ob2 = new NewThread4("Two");
        NewThread4 ob3 = new NewThread4("Three");

        System.out.println("Пoтoк One запущен : " + ob1.t.isAlive());
        System.out.println("Пoтoк Two запущен : " + ob2.t.isAlive());
        System.out.println("Пoтoк Three запущен : " + ob3.t.isAlive());

        try {
            System.out.println("Oжидaниe завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }

        System.out.println("Пoтoк One запущен : " + ob1.t.isAlive());
        System.out.println("Пoтoк Two запущен : " + ob2.t.isAlive());
        System.out.println("Пoтoк Three запущен : " + ob3.t.isAlive());

        System.out.println("Глaвный поток завершен.");
    }
}

class NewThread4 implements Runnable{
    String name;
    Thread t;

    NewThread4(String threadName){
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
