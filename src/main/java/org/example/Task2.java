//Отобразить в окне консоли аргументы командной строки в обратном порядке.
package org.example;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Аргументов в командной строке: " + args.length);
        System.out.print("Начальный порядок аргументов: ");
        for (int i = 0; i < args.length; i++){
            System.out.print(args[i] + " ");
        }
        System.out.print("\nОбратный порядок аргументов: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[args.length - i - 1] + " ");
        }
    }
}
