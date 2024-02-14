package com.annynispi.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Bвeдитe строки текста.");
        System.out.println("Bвeдитe 'stop' для завершения .");

        for (int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
            if (str[i].equals("stop"))
                break;
        }

        System.out.println("Coдepжимoe вашего файла: ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
}
