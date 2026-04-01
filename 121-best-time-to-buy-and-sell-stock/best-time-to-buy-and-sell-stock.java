class Solution {
    public int maxProfit(int[] prices) {
    int minprofit=prices[0];
    int maxprofit=0;
    for(int i=0;i<prices.length;i++){
        minprofit=Math.min(minprofit,prices[i]);
        maxprofit=Math.max(maxprofit,prices[i]-minprofit);
    }
    return maxprofit;
    }
}