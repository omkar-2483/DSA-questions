class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;

        for(int price: prices){
            if(price<minBuy) minBuy=price;
            int profit=price-minBuy;
            if(profit>maxProfit) maxProfit=profit;
        }
        return maxProfit;
    }
}