	package com.exercise7.financial;

public class Main {

    public static void main(String[] args) {

        double investment = 1000.0;
        double annualGrowth = 0.05;
        int period = 10;

        System.out.println("===== Financial Forecast =====");

        double recursiveResult =
                FinancialForecast.forecastValue(investment, annualGrowth, period);

        System.out.println("\nUsing Recursive Method");
        System.out.printf("Future Value after %d years : %.2f%n",
                period, recursiveResult);

        double[] cache = new double[period + 1];

        double memoResult =
                FinancialForecast.forecastValueMemo(
                        investment,
                        annualGrowth,
                        period,
                        cache);

        System.out.println("\nUsing Memoization");
        System.out.printf("Future Value after %d years : %.2f%n",
                period, memoResult);
    }
}