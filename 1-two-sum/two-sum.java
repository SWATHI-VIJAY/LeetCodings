class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<=n;i++){
            int n1=nums[i];
            for(int j=i+1;j<n;j++){
               int n2=nums[j];
               int sum=n1+n2;
               if(sum==target){
                return new int[]{i,j};
               }
            }
            
        }
        return null;
    }

}