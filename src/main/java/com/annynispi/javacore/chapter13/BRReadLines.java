package com.annynispi.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Bвeдитe строки текста.") ;
        System.out.println("Bвeдитe 'stop' для завершения.") ;

        do {
            str = reader.readLine();
//            System.out.println(str);
        }while (!str.equals("stop"));
    }


}
