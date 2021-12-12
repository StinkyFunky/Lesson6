package com.company.task26;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int first = str.indexOf('<') + 1;
        int second = str.indexOf('>', first);
        System.out.println(str.subSequence(first, second));
    }
}
