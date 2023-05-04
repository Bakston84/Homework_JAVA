package org.example.homework.task_003;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sum = 0;
            System.out.print("Введите размер последовательности N целых чисел > ");
            int num = scanner.nextInt();
            for (int index = 0; index < num; index++) {  
                int count = 0;            
                for (int i = 2; ; i++) {
                    if (FormationSequenceIntegers(i)) {
                        count++;
                        if (GenerateRandomInt(num) == i)
                            sum += i;
                    if (count == num) break;
                    }  
                }
            }
            System.out.println("Сумма простых чисел, равна > " + sum);
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

    private static int GenerateRandomInt(int num) {
        Random random = new Random();
        return random.nextInt(num);
    }

    /**
     * 
     * @param i задаём последовательность целых чисел
     * @return возвращаем целое число
     */

    private static boolean FormationSequenceIntegers(int i) {
        if (i == 1) return false;
        for (int j = 2; j <= Math.sqrt(i); j++)
            if(i % j == 0) return false;
        return true;
    }
}