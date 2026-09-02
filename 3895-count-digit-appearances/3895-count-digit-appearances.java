class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];

            while (number != 0) {
                int lastdigit = number % 10;
                if (lastdigit == digit) {
                    count++;
                }
                number /= 10;
            }
        }
        return count;
    }
}