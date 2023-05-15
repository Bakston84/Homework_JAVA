package org.example.homework.task_006;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер LinkedList > ");
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Введите число > ");
                integerLinkedList.addFirst(scanner.nextInt());
            }
            scanner.close();             
            System.out.println(integerLinkedList);
        }
    }
}