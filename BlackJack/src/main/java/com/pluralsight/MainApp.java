package com.pluralsight;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first player's name");
        String name1 = input.nextLine();
        System.out.println(name1);

        System.out.println("Enter second player's name");
        String name2 = input.nextLine();
        System.out.println(name2);
    }
}
