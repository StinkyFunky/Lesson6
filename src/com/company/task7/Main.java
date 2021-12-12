package com.company.task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(str.indexOf(" ") > -1 ? "(" + str.trim() + ")" : str);
    }
}
