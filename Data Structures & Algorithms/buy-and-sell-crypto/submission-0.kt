class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0

        for(i in prices.indices){
            for(j in i + 1 until prices.size){
                val profit = prices[j] - prices[i]
                maxProfit = Math.max(maxProfit, profit)
            }
        }
        return maxProfit
    }
}
