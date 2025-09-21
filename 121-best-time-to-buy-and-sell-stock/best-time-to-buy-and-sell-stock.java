class Solution {
    public int maxProfit(int[] prices) {
        int minprofit=Integer.MAX_VALUE;
        int max=0;
        for(int price:prices){
            if(price<minprofit){
                minprofit=price;
            }else if(price-minprofit>max){
                max=price-minprofit;
            }
        }
        return max;
        
    }
}