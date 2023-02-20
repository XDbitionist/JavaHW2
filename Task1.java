package org.example.hw2;
//Дана последовательность N целых чисел. Найти сумму простых чисел.
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Читаем количество чисел
        int n = input.nextInt();

        // Обходим каждое число и проверяем, является ли оно простым
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            if (isPrime(number)) {
                sum += number;
            }
        }

        System.out.println("Сумма простых чисел: " + sum);
    }

    // Функция, которая проверяет, является ли число простым
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//    Этот код читает количество чисел n, а затем n целых чисел из стандартного ввода.
//        Для каждого числа мы проверяем, является ли оно простым, используя функцию isPrime. Если число является простым, мы добавляем его к сумме.
//        Функция isPrime проверяет, является ли число простым, используя простой алгоритм. Мы проверяем, делится ли число на какое-либо число от 2 до квадратного корня из числа (включительно). Если делится, то число не является простым и мы возвращаем false.
//        Если же мы прошли все проверки, то число является простым и мы возвращаем true.