package com.company.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String str2 = "java";

        if(str.equalsIgnoreCase(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
