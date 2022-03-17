package com.IT_Overone;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println ("Введите 5 чисел для заполнения массива:");

        int[] values = new int[5];
        for (int i= 0; i < values.length; i++){
            values [i] = new Scanner(System.in).nextInt();
        }
        String isGreaterThan20;
        for (int i= 0; i < values.length; i++){
            values[i] += 10;
            if (values [i] > 20) {
                isGreaterThan20 = "больше 20-ти";
            }
            else {
                isGreaterThan20 = "меньше 20-ти";
            }
            System.out.println(values[i] + "->" + isGreaterThan20);

        }
    }
}
