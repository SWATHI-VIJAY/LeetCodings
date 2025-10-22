class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice=0;
        int bob=0;
        for(int candies:aliceSizes){
            alice+=candies;
        }
        for(int candies:bobSizes){
            bob+=candies;
        }
        int m=aliceSizes.length, n=bobSizes.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((alice-aliceSizes[i]+bobSizes[j])==(bob-bobSizes[j]+aliceSizes[i])){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[0];
        
    }
}