package ru.netology.services;

public class numberOfMonthsOfVacation {

    public int calculate(int income, int expenses, int threshold) {
        // int income - сколько заработал
        // int expenses - сколько потратил
        // int threshold - сколько должно быть денег на счету, чтобы отдыхать
        int count = 0; // количество месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                count = count + 1;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
