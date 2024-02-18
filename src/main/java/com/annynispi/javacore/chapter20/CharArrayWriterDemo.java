package com.annynispi.javacore.chapter20;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "Эти данные должны быть выведены в массив";
        char buf[] = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println( "Oшибкa записи в буфер.");
                return ;
        }

        System.out.println("Бyфep в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("B массив");

        char c[] = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        System.out.println("\nB поток вывода типа FileWriter()");

        try(FileWriter f2 = new FileWriter("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода : "+ e) ;
        }

        System.out.println("Ycтaнoвкa в исходное состояние");
        f.reset();

        for(int i=0 ; i<3 ; i++ )
            f.write('Х');

        System.out.println(f.toString());
    }
}
