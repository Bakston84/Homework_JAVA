package org.example.homework.task_002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите последовательность чисел > ");
            String str = scanner.nextLine();
            System.out.println("Сумма положительных чисел перед отрицательным, равна > " + SumNumbers(str));
        }
    }

    /**
     *
     * @param str последовательность чисел
     * @return возвращаем сумму положительных чисел перед отрицательным
     */

    private static String SumNumbers(String str) {
        String[] arr = str.split(" ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) < 0)
                sum += Integer.parseInt(arr[i-1]);
        }
        return String.valueOf(sum);
    }
}