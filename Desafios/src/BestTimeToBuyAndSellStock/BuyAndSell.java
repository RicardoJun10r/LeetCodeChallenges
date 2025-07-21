package BestTimeToBuyAndSellStock;

public class BuyAndSell {

    public static void main(String[] args) {
        int result = maxProfit(new int[] { 2, 4, 1 });
        System.out.println(result);
    }

    static int maxProfit(int[] prices) {
        int profit = 0;
        int minorPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minorPrice) {
                minorPrice = price;
            } else if (price - minorPrice > profit) {
                profit = price - minorPrice;
            }
        }
        return profit;
    }
}