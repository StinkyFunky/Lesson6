package com.company.task23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                result += '0';
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
