class Solution {
    public int addDigits(int num) {
        int sum=Sum(num);
        while(sum>9){
            sum=Sum(sum);

        }
        return sum;
    }
    public int Sum(int num){

    int sum=0;
        while(num>0){
            
            sum+=num%10;
            num/=10;
            
        }

        return sum;
        
    }
}