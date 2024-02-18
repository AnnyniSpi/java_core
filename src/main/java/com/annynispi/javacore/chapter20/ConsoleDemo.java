package com.annynispi.javacore.chapter20;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();

        if( con == null) return;

        str = con . readLine ( " Bвeдитe строку : " ) ;
        con.printf(" Бведенная вами строка : %s\n", str) ;
    }
}
