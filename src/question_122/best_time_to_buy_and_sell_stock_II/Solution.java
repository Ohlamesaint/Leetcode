package question_122.best_time_to_buy_and_sell_stock_II;


/**
 * <h2>best-time-to-buy-and-sell-stock-ii</h2>
 * <strong>Time Complexity: O(n)</strong>
 *
 * <p>Tag： Greedy, DP, Array</p>
 * <p></p>
 * @see <a href=https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/>https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/</a>
 *
 */

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1 || prices.length==0) return 0;
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i-1]<prices[i]) profit+=(prices[i]-prices[i-1]);
        }
        return profit;
    }
}
