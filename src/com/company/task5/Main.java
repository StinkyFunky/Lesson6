package com.company.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String str2 = scanner.next();

        if(str.equalsIgnoreCase(str2)) {
            System.out.println("THEY ARE EQUAL");
        } else {
            System.out.println("THEY ARE NOT EQUAL");
        }
    }
}
