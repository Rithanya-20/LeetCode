class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int res = 0;

        if(target > nums[high]){
            return high+1;
        }

        while(low <= high){
            int mid = low + (high - low)/2;
            System.out.println(mid + " "+ res);

            if(target >= nums[mid]){

                if(target > nums[mid] ){
                    res = mid + 1;
                }
                else{
                     res = mid;
                }
                
                 low = mid + 1;
            }
            else{
                  high = mid - 1;
            }

        }
        return res;
    }
}
