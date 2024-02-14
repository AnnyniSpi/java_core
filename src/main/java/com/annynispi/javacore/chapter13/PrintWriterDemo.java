package com.annynispi.javacore.chapter13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {

        PrintWriter writer = new PrintWriter(System.out, true);

        writer.println("Этo строка");
        int i = -7;
        writer.println(i);
        double d = 4.5e-7;
        writer.println(d);
    }
}
