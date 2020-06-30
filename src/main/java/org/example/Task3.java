// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
package org.example;

import java.util.Scanner;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Задайте количество случайных элементов: ");
        Scanner in = new Scanner(System.in);
        String cntS = in.nextLine();
        int cnt = Integer.parseInt(cntS);
        int[] num = new int[cnt];
        System.out.println(cnt +" случайных элементов с переходом на новую строку:");
        for (int i = 0; i < cnt; i++){
            Random random = new Random();
            num[i] = random.nextInt(1000);
            System.out.println(num[i]);
        }
        System.out.print(cnt +" случайных элементов без перехода на новую строку: ");
        for (int i = 0; i < cnt; i++){
            System.out.print(num[i] + " ");
        }
    }
}
