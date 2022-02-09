package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        int[] sales = {9, 15, 13, 16, 17, 22, 19, 23, 7, 14, 14, 18};
        int expected = 187;

        int actual = service.calculateSumSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldAverageSale() {
        StatsService service = new StatsService();
        int[] sales = {9, 15, 13, 16, 17, 22, 19, 23, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        long[] sales = {9, 15, 13, 16, 17, 22, 19, 23, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {9, 15, 13, 16, 17, 22, 19, 23, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {9, 15, 13, 16, 17, 22, 19, 23, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateSalesBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {9, 15, 13, 16, 17, 22, 19, 23, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateSalesBelowAverage(sales);

        assertEquals(expected, actual);
    }
}