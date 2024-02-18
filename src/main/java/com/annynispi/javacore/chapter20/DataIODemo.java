package com.annynispi.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (IOException e) {
            System.out.println("Owибкa ввода-вывода : "+ e);
        }

        try(DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))){

            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Пoлyчaeмыe значения : " + d + " " + i +" "+ b) ;

        } catch (IOException e) {
            System.out.println("Owибкa ввода-вывода : "+ e);
        }
    }
}
