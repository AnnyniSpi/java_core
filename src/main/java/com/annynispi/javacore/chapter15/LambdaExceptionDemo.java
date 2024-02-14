package com.annynispi.javacore.chapter15;

public class LambdaExceptionDemo{
    public static void main(String[] args) throws EmptyArrayException{

        double[] values = { 1.0, 2.0 , 3.0, 4.0};

        DoubleNumericArrayFunc average = n -> {
          double sum = 0;

          if (n.length == 0){
              throw new EmptyArrayException();
          }

            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }

            return sum / n.length;
        };

        System.out.println("Cpeднee равно " + average.func(values));
//        System.out.println("Cpeднee равно " + average.func( new double[0]));

    }
}

class EmptyArrayException extends Exception {
    EmptyArrayException(){
        super("Maccив nуст");
    }
}

interface DoubleNumericArrayFunc{
    double func(double[] n) throws EmptyArrayException;
}