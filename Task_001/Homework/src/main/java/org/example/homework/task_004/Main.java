package org.example.homework.task_004;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int temp = 0;
            System.out.print("Введите размер последовательности N целых чисел > ");
            int num = scanner.nextInt();
            for (int index = 0; index < num; index++) { 
                int number = generateRandomInt(num);
                if (number <= temp) {
                    System.out.println("Последовательность целых чисел не является возрастающей");
                    break;
                    }
                temp = number; 
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     * @param num задаём диапазон случайного числа
     * @return возвращаем случайное число
     */

    private static int generateRandomInt(int num) {
        Random random = new Random();
        return random.nextInt(num);
    }
}