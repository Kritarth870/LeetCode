class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1,-1};

        int low = 0 , high = nums.length-1;

         while (low<=high){
            int mid = low +(high -low)/2;
            
            if(nums[mid] == target ){
                if(mid > 0  && nums[mid] == nums[mid-1]){ 
                    high = mid-1;
                }else{
                    arr[0] = mid;
                    break;
                }
            }
            else if(nums[mid] < target){
                low = mid+1;
            }else if(nums[mid] > target){
                high = mid-1; 
            }
        }

        low = 0 ; high = nums.length-1;

        while (low<=high){
            int mid = low +(high -low)/2;
            
            if(nums[mid] == target ){
                if(mid < nums.length-1  && nums[mid] == nums[mid+1]){ 
                    low = mid+1;
                }else{
                    arr[1] = mid;
                    break;
                }
            }
            else if(nums[mid] < target){
                low = mid+1;
            }else if(nums[mid] > target){
                high = mid-1; 
            }
        }

        return arr;
    }
}