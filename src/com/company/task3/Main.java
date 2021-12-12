package com.company.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String str2 = "ITSTEP";

        if(str.equals(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
