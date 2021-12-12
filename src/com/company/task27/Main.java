package com.company.task27;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String results = text.replace(str1, str2);

        System.out.println(results);
    }
}
