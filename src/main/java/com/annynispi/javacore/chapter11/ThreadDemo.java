package com.annynispi.javacore.chapter11;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

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

class NewThread implements Runnable{
    Thread t;

    public NewThread(){
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Дoчepний поток создан : "+ t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток : "+ i );
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дoчepний поток прерван.");
        }

        System.out.println("Дoчepний поток завершен.");
    }
}
