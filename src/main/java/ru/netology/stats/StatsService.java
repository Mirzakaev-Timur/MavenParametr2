package ru.netology.stats;

public class StatsService {
    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;// переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;// переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int calculateSalesBelowAverage(int[] sales) {
        int belowArg = 0;
        int avg = calculateAverage(sales);
        for (long sale : sales) {
            if (sale < avg) {
                belowArg++;
            }
        }
        return belowArg;
    }

    public int calculateSalesAboveAverage(int[] sales) {
        int belowArg = 0;
        int avg = calculateAverage(sales);
        for (long sale : sales) {
            if (sale > avg) {
                belowArg++;
            }
        }
        return belowArg;
    }
}








