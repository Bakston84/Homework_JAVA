package org.example.homework.task_004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuilder str = new StringBuilder();
            int count = 0;
            System.out.print("Введите последовательность N целых чисел > ");
            int number = scanner.nextInt();
            for (int i = 2; ; i++) {
                if (FormationSequenceIntegers(i)) {
                    count++;
                    str.append(i).append(" ");
                if (count == number) { 
                    AscendingCheck(str);
                    break;
                }
            }  
        }
    }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static void AscendingCheck(StringBuilder str) {
        String[] arr = str.toString().split(" ");
        for (int i = 1; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) <= Integer.parseInt(arr[i - 1])) {
                System.out.print("Последовательность целых чисел не является возрастающей");
            }
        }
        System.out.print("Последовательность целых чисел является возрастающей");
    }

    private static boolean FormationSequenceIntegers(int i) {
        if (i == 1) return false;
        for (int j = 2; j <= Math.sqrt(i); j++)
            if(i % j == 0) return false;
        return true;
    }
}
