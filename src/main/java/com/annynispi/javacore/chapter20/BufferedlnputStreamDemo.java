package com.annynispi.javacore.chapter20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedlnputStreamDemo {
    public static void main(String[] args) {
        String s = "Это знак авторского права &сору; " + ", а &сору - нет . \n";

        byte buf[] = s.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean marker = false;

        try(BufferedInputStream f = new BufferedInputStream(in)) {

            while ((c = f.read()) != -1){
                switch (c){
                    case '&':
                        if (!marker){
                            f.mark(32);
                            marker = true;
                        } else {
                            marker = false;
                        }
                        break;
                    case ';':
                        if (marker){
                            marker =  false;
                            System.out.print("(c)");
                        }
                        break;
                    case ' ':
                        if (marker){
                            marker = false;
                            f.read();
                            System.out.print("&");
                        }else {
                            System.out.print((char) c);
                        }
                        break;
                    default:
                        if (!marker){
                            System.out.print((char) c);
                        }
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода : "+ e);
        }

    }
}
