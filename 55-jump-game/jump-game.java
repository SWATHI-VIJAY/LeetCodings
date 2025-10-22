class Solution {
    public boolean canJump(int[] nums) {
        int range=0;
        for(int i=0;i<nums.length;i++){
            if(range<i) return false;
            range=Math.max(range,i+nums[i]);
        }
        return true;

        
    }
}