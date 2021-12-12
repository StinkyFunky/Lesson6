package com.company.task29;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new  Scanner(System.in);
        String math = scanner.nextLine().trim().replaceAll("\\+", " ");
        math = math.replaceAll("-", " -");

        Scanner parser = new  Scanner(math);
        long result = 0;

        while(parser.hasNext()) {
            result += parser.nextInt();
        }

        System.out.println(result);
    }
}
