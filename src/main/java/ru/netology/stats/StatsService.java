package ru.netology.stats;

public class StatsService {
    public int sum (int[] sales){

        int sum = 0;
        for (int sale:sales){
            sum += sale;
        }
        return sum;
    }
    public double mediumSum(int[] sales){

        return (double)sum(sales) / sales.length;
    }

    public int maxMonths(int[] sales){

        int max = sales[0];
        int count = 0;
        int month = 1;
        for (int sale : sales){
            count ++;
            if (max <= sale){
                max = sale;
                month = count;
            }
        }
        return month;
    }
    public int minMonth(int[] sales){
        int min = sales[0];
        int count = 0;
        int month = 0;
        for (int sale : sales){
            count ++;
            if (min >= sale){
                month = count;
                min = sale;
            }
        }
        return month;
    }
    public int lowMedium(int[] sales){
        int count = 0;
        for (int sale : sales){
            if (sale < mediumSum(sales)) count++;
        }
        return count;
    }
    public int highMedium(int[] sales){
        int count = 0;
        for (int sale : sales){
            if (sale > mediumSum(sales)) count++;
        }
        return count;
    }
}
