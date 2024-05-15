package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class numberOfMonthsOfVacationTest {
    @Test
    public void testNumberOfMonthsOfVacation() {
        numberOfMonthsOfVacation servise = new numberOfMonthsOfVacation();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int actual = 3;
        int count = servise.calculate(income, expenses, threshold);
        Assertions.assertEquals(actual, count);
    }

    @Test
    public void testNumberOfMonthsOfVacationOne() {
        numberOfMonthsOfVacation servise = new numberOfMonthsOfVacation();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int actual = 2;
        int count = servise.calculate(income, expenses, threshold);
        Assertions.assertEquals(actual, count);
    }

}
