package org.example.hw_28_05_2024;

public class WorkdayCounter {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 28801); // Генерация случайного числа от 0 до 28800 включительно
        showTimeLeft(n);
    }

    public static void showTimeLeft(int secondsLeft) {
        System.out.println("На табло: " + secondsLeft + " секунд");
        int hoursLeft = secondsLeft / 3600;

        if (hoursLeft >= 5) {
            System.out.println("Осталось " + hoursLeft + " часов");
        } else if (hoursLeft >= 2) {
            System.out.println("Осталось " + hoursLeft + " часа");
        } else if (hoursLeft == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}
