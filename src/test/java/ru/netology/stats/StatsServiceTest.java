package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    static int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7 ,14, 14, 18};
    static StatsService service = new StatsService();

    @Test
    void testSum() {
        long expected = 180;

        long actual = service.sum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void testMediumSum() {
        double expected = 15;

        double actual = service.mediumSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void testMaxMonths() {
        int expected = 8;
        int actual = service.maxMonths(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minMonth() {
        int expected = 9;
        int actual = service.minMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void lowMedium() {
        int expected = 5;
        int actual = service.lowMedium(sales);
        assertEquals(expected, actual);
    }

    @Test
    void highMedium() {
        int expected = 5;
        int actual = service.highMedium(sales);
        assertEquals(expected, actual);
    }
}