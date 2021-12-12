package com.company.task19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        if(str.equals(new StringBuilder(str).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
