class Solution {
    public int mySqrt(int x) {
      int low = 1;
      int high = x;
      int res = 0;
      while(low <= high){

        int mid = low + (high - low)/2;

        System.out.println(mid);

        if((long)mid*mid <= (long)x){
           res = mid;
            low = mid + 1;
           
        }
        else{
            high = mid - 1;
        }
      }

      return res;
       
    }
}
