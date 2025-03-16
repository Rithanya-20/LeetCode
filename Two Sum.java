class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        HashMap <Integer, Integer> myMap = new HashMap<>();

        for(int i = 0; i < n; i++){

            int rem = target - nums[i];

            if(myMap.containsKey(rem)){

                return new int[] {myMap.get(rem), i};

            }

            myMap.put(nums[i], i);
        }

       return new int[]{};

    }
}
