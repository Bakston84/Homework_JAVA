package org.example.homework.task_005;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива > ");
            int num = scanner.nextInt();
            int[] arr = new int[num];
            int count = 0;
            for (int index = 0; index < arr.length; index++) {
                arr[index] = generateRandomInt(num);
                if (arr[index] < 0)
                count += index;
                System.out.print(arr[index] + " ");
            }
            System.out.println(" ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0)
                arr[i] = count;
                System.out.print(arr[i] + " ");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static int generateRandomInt(int num) {
        Random random = new Random();
        return random.nextInt((num - (-num)) + 1) + (-num);
    }
}