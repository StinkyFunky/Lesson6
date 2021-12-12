package com.company.task13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println(reverse);
    }
}
