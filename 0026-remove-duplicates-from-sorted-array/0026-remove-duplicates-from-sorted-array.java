class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int k : nums) {
            set.add(k);

        }
        int i = 0;
        for (int l : set) {
            nums[i] = l;
            i++;
        }
        return set.size();

    }
}