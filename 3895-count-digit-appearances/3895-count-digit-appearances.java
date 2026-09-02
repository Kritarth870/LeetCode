class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;

        for(int i=0 ; i<nums.length ; i++){
            int no = nums[i];

            while(no != 0){
                int ld = no%10;
                if(ld == digit){
                    count++;
                }
                no/=10;
            }
        }
        return count;
    }
}