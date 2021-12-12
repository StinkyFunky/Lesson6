package com.company.task12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            result = str.replace('a','o');
        }

        System.out.println(result);
    }
}
