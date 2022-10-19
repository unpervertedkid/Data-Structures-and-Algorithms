package leetcode.arrays;

public class BestTimeToBuyStock {
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        //Initial minimum price
        int minPrice = prices[0];
        int profit = 0;
        for (int price : prices) {
            //Buy at a lower price whenever we can
            minPrice = Math.min(minPrice, price);

            //Sell at the time which makes the maximum profit
            profit = Math.max(profit, price - minPrice);
        }
        return profit;

    }
}
