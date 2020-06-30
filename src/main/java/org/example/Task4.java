//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
package org.example;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Аргументы: ");
        for (int i = 0; i < args.length; i++){
            System.out.print(args[i] + " ");
        }
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
            mult = mult * Integer.parseInt(args[i]);
        }
        System.out.print("\nСумма аргументов: " + sum);
        System.out.print("\nПроизведение аргументов: " + mult);
    }
}