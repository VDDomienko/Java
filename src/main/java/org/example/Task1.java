//Приветствовать любого пользователя при вводе его имени через командную строку.
package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter your name, please!");
        Scanner in = new Scanner(System.in);
        System.out.print("My name is: ");
        String name = in.nextLine();
        System.out.println("Hello and welcome, " + name + "!");
    }
}
