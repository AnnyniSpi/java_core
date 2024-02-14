package com.annynispi.javacore.chapter10;

public class FinallyDemo {

    public static void procA(){
        try {
            System.out.println("B теле метода procA()");
            throw new RuntimeException("дeмoнcтpaция");
        } finally {
            System.out.println("Блок оператора finally в методе procA()") ;
        }
    }

    public static void procB(){
        try {
            System.out.println("B теле метода procB()");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB()") ;
        }
    }

    public static void procC(){
        try {
            System.out.println("B теле метода procC()");
        } finally {
            System.out.println("Блок оператора finally в методе procC()") ;
        }
    }

    public static void main(String[] args) {

        try {
            procA();
        } catch (Exception e){
            System.out.println("Иcключeниe перехвачено");
        }

        procB();
        procC();
    }
}
