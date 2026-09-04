class Solution:
    def firstStableIndex(self, nums: List[int], k: int) -> int:
        for i in range(len(nums)):
            max_val = float('-inf')

            for j in range(i + 1):
                max_val = max(max_val, nums[j])

            min_val = float('inf')

            for j in range(i, len(nums)):
                min_val = min(min_val, nums[j])

            if max_val - min_val <= k:
                return i

        return -1