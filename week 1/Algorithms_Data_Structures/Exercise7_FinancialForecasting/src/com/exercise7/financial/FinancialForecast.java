package com.exercise7.financial;

public class FinancialForecast {

    // Recursive approach
    public static double forecastValue(double amount, double rate, int duration) {

        if (duration == 0) {
            return amount;
        }

        return forecastValue(amount * (1 + rate), rate, duration - 1);
    }

    // Optimized recursive approach using memoization
    public static double forecastValueMemo(double amount, double rate, int duration, double[] cache) {

        if (duration == 0) {
            return amount;
        }

        if (cache[duration] != 0) {
            return cache[duration];
        }

        cache[duration] =
                forecastValueMemo(amount * (1 + rate), rate, duration - 1, cache);

        return cache[duration];
    }
}