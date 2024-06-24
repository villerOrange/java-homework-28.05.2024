package org.example.hw_28_05_2024;

import java.util.Scanner;

public class ClosestToTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение m: ");
        double m = scanner.nextDouble();
        System.out.print("Введите значение n: ");
        double n = scanner.nextDouble();
        scanner.close();

        closestToTen(m, n);
    }

    public static void closestToTen(double m, double n) {
        //работаю с абсолютными значениями, в задаче не говорилось,
        // что пользователь сожет ввести отрицательное число.
        // при необходимости можно доработать
        double distanceToTenM = Math.abs(10 - m);
        double distanceToTenN = Math.abs(10 - n);

        if (distanceToTenM < distanceToTenN) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (distanceToTenN < distanceToTenM) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Числа " + m + " и " + n + " находятся на одинаковом расстоянии от 10.");
        }
    }
}
