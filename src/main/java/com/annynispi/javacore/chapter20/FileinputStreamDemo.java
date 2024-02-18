package com.annynispi.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStreamDemo {
    public static void main(String[] args) {
        int size;

        try(FileInputStream inputStream = new FileInputStream("FileinputStreamDemo.java")) {
            System.out.println("Oбщee количество доступных байтов : " + ( size = inputStream.available()));

            int n = size/40;
            System.out.println("Пepвыe " + n + " байтов, " + " прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.println((char) inputStream.read());
            }

            System.out.println("\nBce еще доступно : "+ inputStream.available());
            System.out.println("Чтeниe следующих " + n + " байтов по очереди методом read ( b[J )");

            byte[] b = new byte[n];
            if (inputStream.read() != n){
                System.err.println("Нельзя прочитать "+ n + " байтов.");
            }

            System.out.println(new String(b, 0, n ));
            System.out.println("\nBce еще доступно : " + ( size = inputStream.available()));
            System.out.println("Пропустить половину оставшихся байтов методом s kip ()");

            inputStream.skip(size/2);
            System.out.println("Bce еще доступно : "+ inputStream.available());

            System.out.println("Чтeниe " + n/2 + " байтов, размещаемых в конце массива");

            if (inputStream.read(b, n/2, n/2) != n/2){
                System.err.println("Нельзя прочитать "+ n/2 + " байтов.");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nBce еще доступно : "+ inputStream.available());
        } catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода : "+ e);
        }
    }
}
