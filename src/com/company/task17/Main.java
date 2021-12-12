package com.company.task17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String reverse = new StringBuffer(str1).reverse().toString();

        if(reverse.equals(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
