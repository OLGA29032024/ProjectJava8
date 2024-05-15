package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        numberOfMonthsOfVacation servise = new numberOfMonthsOfVacation();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int count = servise.calculate(income, expenses, threshold);
        System.out.println(count);

        income = 100_000;
        expenses = 60_000;
        threshold = 150_000;
        count = servise.calculate(income, expenses, threshold);
        System.out.println(count);

    }
}
