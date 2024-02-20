package com.annynispi.javacore.chapter11;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Глaвный поток : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван .");
        }
        System.out.println("Глaвный поток завершен.");
    }
}

class NewThread2 extends Thread{

    public NewThread2(){
        super("Демонстрационный поток");
        System.out.println( "Дoчepний поток : "+ this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток : "+ i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дoчepний поток прерван.");
        }
        System.out.println("Дoчepний поток завершен.");
    }
}
