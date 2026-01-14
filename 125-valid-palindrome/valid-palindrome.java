class Solution {
    public boolean isPalindrome(String s) {
        String word=s.replaceAll("[^a-zA-Z0-9]","");
        word=word.toLowerCase();
        char[]arr=word.toCharArray();
        boolean flag=false;
        int left=0,right=arr.length-1;
        if(arr.length==0){
            flag=true;
        }
        while(left<=right){
            
            if(arr[left]==arr[right]){
                left++;
                right--;
                flag=true;
            }else{
                flag=false;
                break;
            }
        }
        return flag;
    }
}