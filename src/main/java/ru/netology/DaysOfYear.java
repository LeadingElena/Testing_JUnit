package ru.netology;

public class DaysOfYear {
    public static int daysOfYear(int year) {
        int day;
        int correctDay;
        if (year % 400 == 0) {
            return correctDay = 366;
        }
        if (year % 100 == 0) {
            return correctDay = 366;
        }
        if (year % 4 == 0) {
            return correctDay = 366;
        } else {
            return correctDay = 365;
        }
    }
}
