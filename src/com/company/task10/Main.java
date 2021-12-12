package com.company.task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }

        System.out.println(result);
    }
}
