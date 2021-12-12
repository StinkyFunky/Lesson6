package com.company.task30;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] words = str.replaceAll("[\",.]","").split("\\s+");

        for(String word: words) {
            System.out.print(new StringBuilder(word).reverse());
            System.out.print(" ");
        }
    }
}
