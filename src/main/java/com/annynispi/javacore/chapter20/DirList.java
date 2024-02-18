package com.annynispi.javacore.chapter20;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirName = File.separator + "java";
        File f1 = new File(dirName);

        if (f1.isDirectory()){
            System.out.println("Kaтaлoг " + dirName);
            String strArr[] = f1.list();

            for (int i = 0; i < strArr.length; i++) {
                File f = new File(dirName + "/" + strArr[i]);
                if (f.isDirectory()){
                    System.out.println(strArr[i] + " является каталогом" );
                } else {
                    System.out.println(strArr[i] + " является файлом" );
                }
            }
        }else {
            System.out.println(dirName +" не является каталогом");
        }

    }
}
