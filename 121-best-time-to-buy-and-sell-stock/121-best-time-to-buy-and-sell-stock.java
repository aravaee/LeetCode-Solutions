class Solution {
    public int maxProfit(int[] prices) {
        
        int current_lowest = Integer.MAX_VALUE;
        int current_highest = Integer.MIN_VALUE;
        
        int i = 0;
        
        while(i < prices.length){            
            if(prices[i] < current_lowest){
                current_lowest = prices[i];
            }
            else if(prices[i] - current_lowest > current_highest){
                current_highest = prices[i] - current_lowest;
            }
            i++;
        }
        
        
        if(current_highest <= 0 || prices.length == 1){
            return 0;
        }
        
        return current_highest;
    }
}