class Solution:
    def countDigitOccurrences(self, nums, digit):
        count = 0

        for number in nums:
            while number != 0:
                last_digit = number % 10

                if last_digit == digit:
                    count += 1

                number //= 10

        return count