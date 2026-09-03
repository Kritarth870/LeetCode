class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arr[] = new int[nums.length];

        for(int i=0 ; i<nums.length ; i++){

            int sumj = 0;

            for(int j=0 ; j<i ; j++){
                sumj += nums[j];
            }

            int sumk = 0;

            for(int k=nums.length-1 ; k>i ; k--){
                sumk += nums[k];
            }

            if(sumk - sumj < 0){
                arr[i] = -1*(sumk - sumj);
            }else{
                arr[i] = sumk - sumj;
            }
        }
        return arr;
    }
}