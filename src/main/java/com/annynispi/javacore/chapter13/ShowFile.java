package com.annynispi.javacore.chapter13;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        if (args.length != 1){
            System.out.println("Иcпoльзoвaниe : ShowFile имя_файла ");
            return ;
        }

        try (FileInputStream fileInputStream = new FileInputStream(args[0]);){
            do {
                i = fileInputStream.read();
                if (i != -1)
                    System.out.print( (char) i) ;
            } while (i != -1);

        }catch (IOException e){
            System.out.println("Heвoзмoжнo открыть файл");
        }
    }
}
