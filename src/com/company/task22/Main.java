package com.company.task22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String result = str.substring(0,1).toLowerCase() + str.substring(1).toLowerCase();

        System.out.println(result);
    }
}
