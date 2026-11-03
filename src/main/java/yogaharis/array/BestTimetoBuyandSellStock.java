package yogaharis.array;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        var maxProfit = 0;
        var minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }

           var todayProfit = prices[i] - minPrice;

            if (todayProfit > maxProfit){
                maxProfit = todayProfit;
            }
        }

        return maxProfit;
    }
}
