package com.company.task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String c = scanner.next();

        int n = str.indexOf(c);

        String answer = n > -1 ? String.valueOf(n) : "THERE IS NO SUCH LETTER";

        System.out.println(answer);
    }
}
