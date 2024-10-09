// Задание №8

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Радиус = 5
        int r = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        // Вычисление значения функции y(x)
        double y = Math.acos(Math.pow((Math.pow(x, 1.0/5))/(Math.pow(x, 1.0/5) + 1), 9))
               + Math.log(Math.pow(5, 2) * (Math.pow(4, Math.tan(3 * x)) + Math.sqrt(Math.abs(3 * x - 1)) + Math.pow(Math.abs(x), Math.sin(2 * x))));

        // Проверка: лежит точка на дуге полукруга, внутри него или вне
        // Расстояние от точки до начала координат s = sqrt(x^2+y^2)
        // Если расстояние от точки до начала координат s = r - точка лежит на дуге,
        // < r - лежит внутри, > r - вне
        // Чтобы точка лежала в области полукруга, с центром в начале координат, сумма квадратов еe координат должна быть <= r^2
        // x^2 + y^2 <= r^2
        // y <= +-sqrt(25-x^2)
        // У нас нижний полукруг => неравенство имеет вид y <= -sqrt(25-x^2)
        // У функции y = -sqrt(25-x^2) x принимает значения от -5 до 5 включительно, y от -5 до 0 включительно
        // Точка с координатами (0; 0) является началом координат => принадлежит области полукруга
        // Точка с координатами (0; 0) пройдет все условия, кроме y <= -sqrt(25-x^2)
        // Так как неравенство 0 <= -5 - неверно
        // А точка принадлежит области. Значит, пишем дополнительное условие

        // График функции нижнего полукруга с радиусом 5 и с центром в начале координат
        double semicircle = -Math.sqrt(25 - Math.pow(x, 2));
        // Расстояние от точки до начала координат
        double s = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        // Проверка условий
        boolean satisfiesCondition = ((x >= -5 && x <= 5) && (y >= -5 && y <= 0) && (y <= semicircle) && (s <= r)) || (x == 0 && y == 0);

        System.out.println("Значение функции y(" + x + ") = " + y);
        System.out.println("Точка лежит в области полукруга: " + satisfiesCondition);

        scanner.close();
    }
}