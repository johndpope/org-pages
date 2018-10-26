package leetcode;


public class Code_122 {
    /**
     * O(n)
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int profit = 0, i = 0, j;
        while (i < prices.length) {
            j = i;
            while (j < prices.length - 1 && prices[j] < prices[j+1]) j=j+1;
            profit += (prices[j] - prices[i]);
            i = j + 1;
        }
        return profit;
    }
}
