package com.programe.datastructure.assignments.Oct23;

import java.util.ArrayList;
import java.util.Arrays;

public class BestTimeBuyAndSellStocks {

    public static void main(String[] args) {
        /**
         * Q3. Best Time to Buy and Sell Stocks I
         *
         * Problem Description -
         * Say you have an array, A, for which the ith element is the price of a given stock on day i.
         * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
         * Return the maximum possible profit.
         *
         * Problem Constraints
         * 0 <= A.size() <= 700000
         * 1 <= A[i] <= 107
         *
         * Example -
         * Input 1:
         * A = [1, 4, 5, 2, 4]
         * Output - 4
         * Explanation :
         * Buy the stock on day 0, and sell it on day 2.
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 4, 5, 2, 4));
        System.out.printf("Max profit - {%d}",findMaxProfit(list));
    }


    /**
     * Time Complexity - 0(N)
     * @param list
     * @return
     */
    private static int findMaxProfit(ArrayList<Integer> list) {
        int maxProfit=0;
        if(list.isEmpty()) {
            return maxProfit;
        }
        int minStockPrice=list.get(0);
        for(int i=1;i<list.size();i++) {
            int stockPrice = list.get(i);
            if(stockPrice<minStockPrice) {
                minStockPrice = stockPrice;
            } else {
                int profit = stockPrice-minStockPrice;
                if(profit>maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
