class Solution:
    def findDuplicates(self, nums):
        al = []
        hs = set()

        for num in nums:
            if num in hs:
                al.append(num)
            else:
                hs.add(num)

        return al