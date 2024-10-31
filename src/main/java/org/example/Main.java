// Задание №8

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        // Вычисление значения функции y(x)
        double y = Math.acos(Math.pow((Math.pow(x, 1.0/5))/(Math.pow(x, 1.0/5) + 1), 9))
               + Math.log(Math.pow(5, 2) * (Math.pow(4, Math.tan(3 * x)) + Math.sqrt(Math.abs(3 * x - 1)) + Math.pow(Math.abs(x), Math.sin(2 * x))));

        // Проверка условий
        boolean satisfiesCondition = (y <= 0) && (Math.pow(x, 2)+ Math.pow(y, 2) <= 25);

        System.out.println("Значение функции y(" + x + ") = " + y);
        System.out.println("Точка лежит в области полукруга: " + satisfiesCondition);

        scanner.close();
    }
}