class Solution {
    public int countDigits(int num) {
        int t=num;
        int count =0;
        while(num>0){
            int res=num%10;
            if(t%res==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}