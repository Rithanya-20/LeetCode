class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int res = 0;
          for(int i=0; i<numbers.length; i++){
          
            int rem = target - numbers[i];
           
            for(int j= numbers.length-1; j > i; j--){
                if(rem == numbers[j]){
                   result[0] = i+1;
                   result[1] = j+1;
                   return result;
                }
            }
          }
           return result;
    }

   
}
