class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr [] = new int [2];

        int low = 0 , high = nums.length-1 ;
        while(low <= high){
            
            int sum = nums[low] + nums[high];
            if(sum == target){
                arr[0] = low+1;
                arr[1] = high+1;
                return arr;
            }
            
            if(sum > target){
                high--;
            }else{
                low++;
            } 
        }
        return arr;
    }
}