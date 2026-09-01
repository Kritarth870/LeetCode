// class Solution {
//     public int maximumProduct(int[] nums) {

//      Arrays.sort(nums);

//     //  int max = Integer.MIN_VALUE;
//     //    for(int i=0 ; i<nums.length-2 ; i++){
//     //        for(int j=1 ; j<nums.length -1; j++){
//     //             for(int k=2 ; k<nums.length ; k++){
//     //                 if(max<=nums[i]*nums[j]*nums[k]){
//     //                     max = nums[i]*nums[j]*nums[k];
//     //                 }
//     //             }
//     //         }
//     //    } 


//     // // int max = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
//     int a = nums[0]*nums[1]*nums
//        return max;
//     }
// }
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int a = nums[0] * nums[1] * nums[nums.length - 1];
        int b = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];

        if (a > b)
            return a;

        return b;
    }
}