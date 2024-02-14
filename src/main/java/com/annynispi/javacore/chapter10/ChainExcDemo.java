package com.annynispi.javacore.chapter10;

public class ChainExcDemo {

    public static void demoproc(){
        NullPointerException e = new NullPointerException("вepxний уровень");
        e.initCause(new ArithmeticException("пpичинa. "));
        throw(e);
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e){
            System.out.println("Пepexвaчeнo исключение : 11 " + e);
            System.out.println("Пepвoпpичинa : 11 " + e.getCause( ));
        }
    }
}
