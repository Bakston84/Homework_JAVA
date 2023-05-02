package org.example.homework.task_001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите предложение > ");
            String str = scanner.nextLine();
            System.out.println("Предложение в реверсии > " + ReversString(str)); 
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param str значение для реверсии
     * @return возвращаем значение в реверсии
     */

    private static String ReversString(String str) {
        String[] arr = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = arr.length; i > 0; i--) {
            if (arr[i - 1] != String.valueOf(""))
                reversed.append(arr[i - 1]).append(" ");
        }
        return String.valueOf(reversed);
    }
}