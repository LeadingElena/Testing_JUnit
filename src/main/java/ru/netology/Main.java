package ru.netology;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int year;
        int day;
        while (true) {
            System.out.print("Введите год: ");
            String input = scanner.nextLine();

            try {
                year = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число. Перезапустите программу и попробуйте снова.");
                scanner.close();
                break;
            }

            System.out.print("Введите количество дней в году: ");
            input = scanner.nextLine();

            try {
                day = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число. Перезапустите программу и попробуйте снова.");
                scanner.close();
                break;
            }

            int correctDay = DaysOfYear.daysOfYear(year);

            if (day == correctDay) {
                counter++;

            } else {
                System.out.println("Неправильно! В этом году " + correctDay + " дней!");
                System.out.println("Набрано очков: " + counter);
                scanner.close();
                break;
            }

        }
    }
}