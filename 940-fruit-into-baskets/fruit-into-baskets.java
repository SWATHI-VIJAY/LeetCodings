class Solution {
    public int totalFruit(int[] fruits) {
        int lastfruit=-1,secondlast=-1;
        int current=0;
        int lastcount=0,max=0;
        for(int i=0;i<fruits.length;i++){
            int kind=fruits[i];
            if(kind==lastfruit||kind==secondlast){
                current++;
            }else{
                current=lastcount+1;
            }
            if(kind==lastfruit){
                lastcount++;

            }else{
                lastcount=1;
                secondlast=lastfruit;
               
                lastfruit=kind;
            }
            max=Math.max(max,current);
        }
        return max;
        
        
    }
}