package org.example.homework.task_003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 0;
            int sum = 0;
            System.out.print("Введите последовательность N целых чисел > ");
            int number = scanner.nextInt();
            for (int i = 2; ; i++) {
                if (SumNumbers(i)) {
                    count++;
                    sum += i;
                if (count == number) break;
                }  
            }
            System.out.println("Сумма простых чисел, равна > " + sum);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean SumNumbers(int i) {
        if (i == 1) return false;
        for (int j = 2; j <= Math.sqrt(i); j++)
            if(i % j == 0) return false;
        return true;
        }
    }