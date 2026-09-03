class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallestodd = Integer.MAX_VALUE;

        for(int i=0 ; i<nums1.length ; i++){
            if(nums1[i] % 2 != 0){
                smallestodd = Math.min(smallestodd , nums1[i]);
            }
        }

        // for all even 
        if(smallestodd == Integer.MAX_VALUE){
            return true;
        }

        // check for convertion 
        for(int i=0 ; i<nums1.length ; i++){
            if(nums1[i] % 2 == 0 && nums1[i]<= smallestodd){
                return false;
            }
        }
        return true;
    }
}