package ru.netology.stats;

public class StatsService {

    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int monthSalesAverage(int[] sales) {
        return salesSum(sales) / sales.length;
}
    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minMonthSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int monthsLessAverageSalesCount(int[] sales) {
        int count = 0;
        for (int sale : sales) {
            if (sale < monthSalesAverage(sales)) {
                count += 1;
            }
        }
        return count;
    }
    public int monthsHigherAverageSalesCount(int[] sales) {
        int count = 0;
        for (int sale : sales) {
            if (sale > monthSalesAverage(sales)) {
                count += 1;
            }
        }
        return count;
    }
}
