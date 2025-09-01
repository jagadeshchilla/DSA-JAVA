// Best Time to Buy and Sell Stock I
public int maxProfit(int[] prices) {
    int minSoFar = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int price : prices) {
        if (price < minSoFar) {
            minSoFar = price; // update min price
        }
        int profit = price - minSoFar; // profit if sold today
        if (profit > maxProfit) {
            maxProfit = profit; // update max profit
        }
    }
    return maxProfit;
}

// Time complexity: O(n)
// Space complexity: O(1)
