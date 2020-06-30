package org.example;

//Для успешного выполнения задания достаточно реализовать 2-4 пункта.
//
//Задание. Ввести n чисел с консоли.
//1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
//
//2.     Вывести числа в порядке возрастания (убывания) значений их длины.
//
//3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {
        System.out.print("Количество чисел: ");
        Scanner in = new Scanner(System.in);
        String cntS = in.nextLine();

        int cnt = Integer.parseInt(cntS);
        String[] num = new String[cnt]; //num - массив строк введенных чисел

        for (int i = 0; i < cnt; i++) {
            System.out.print("\nВведите число №" + (i + 1) + ": ");
            num[i] = in.nextLine();
        }

        System.out.print("\nВведенные числа: ");
        for (int i = 0; i < cnt; i++) {
            System.out.print(num[i] + " ");
        }

        //1
        int lmin = num[0].length();
        int lmax = num[0].length();
        String nmin = num[0];
        String nmax = num[0];

        for (int i = 0; i < cnt; i++) {
            if (lmin > num[i].length()) {
                lmin = num[i].length();
                nmin = num[i];
            }
            if (lmax < num[i].length()) {
                lmax = num[i].length();
                nmax = num[i];
            }
        }
        System.out.println("\nЧисло " + nmin + " обладает меньшим количеством знаков: " + lmin);
        System.out.println("Число " + nmax + " обладает большим количеством знаков: " + lmax);

        //2
        for (int i = cnt - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (num[j].length() > num[j + 1].length()) {
                    String tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                }
            }
        }
        System.out.print("Порядок по возрастанию длины: ");
        for (int i = 0; i < cnt; i++){
            System.out.print(num[i] + " ");
        }

        //3
        int lsum = 0;
        String[] nulsum = new String[cnt];

        for (int i = 0; i < cnt; i++){
            lsum = lsum + num[i].length();
        }
        int lavr = lsum / cnt;              // lavr - средняя длина чисел
        int ll = 0;                         // ll - Количество чисел меньше средней длины
        for (int i = 0; i < cnt; i++){
            if (num[i].length() < lavr){
                nulsum[ll] = num[i];
                ll++;
            }
        }
        System.out.println("\nСредняя длина чисел: " + lavr);
        System.out.print("\nЧисла короче средней длины: ");
        for (int i = 0; i < ll; i++){
            System.out.print(nulsum[i] + "(" + nulsum[i].length() + ") ");
        }
    }
}
