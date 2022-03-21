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
        /* Практическое задание:
            1. Найдите сумму элементов массива. Результаты вывести на экран
            2. Найдите наименьшее число в массиве и вывести его.
            3. Найдите произведение элементов массива. Результаты вывести на экран
        */
        sum(values);
        System.out.println ("Сумма Элементов массива равна " + sum(values));  // и выводим ее на экран


        int multiply_res = 1;                       // вычисляем произведение элементов массива
        for (int i = 0; i< values.length; i++) {    // с помощью цикла for
            multiply_res *= values[i];
        }
        System.out.println("Произведение элементов рассива равно " + multiply_res); // и выводим на экран

        int values_min = values[0];
        for (int  i = 0; i < values.length; i++) {
            if (values_min > values[i]) values_min = values[i];
        }
        System.out.println("Минимальный элемент массива: " + values_min);

int values_max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values_max < values[i]) values_max = values[i];
                    }
        System.out.println("Максимальный элемент массива: " + values_max);


    }

    private static int sum(int[] values) {
        int summ_res = 0;                           // вычисляем сумму элементов массива
        for (int i = 0; i < values.length; i++) {    // с помощью цикла for
            summ_res += values[i];
        }
        return summ_res;
    }
}
