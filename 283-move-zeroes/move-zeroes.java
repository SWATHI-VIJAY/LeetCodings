class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=0){
                int temp=nums[left];
                nums[left]=nums[r];
                nums[r]=temp;
                left++;
            }
           
        }
    }
}