package org.example.homework.task_007;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите порядок символов > ");
            String s = scanner.nextLine();
            System.out.println("Порядок символов > " + isValid(s)); 
        }
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{'))
            st.push(s.charAt(i));
            else
            {
                if (st.empty()) return false;
                if ((s.charAt(i) == ')') && (st.peek() != '(')) return false;
                if ((s.charAt(i) == ']') && (st.peek() != '[')) return false;
                if ((s.charAt(i) == '}') && (st.peek() != '{')) return false;
                st.pop();
            }
        }
        return st.empty();
    }   
}