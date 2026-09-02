class Solution {
    public int mirrorDistance(int n) {
        int temp = n;
        int rev = 0;

        while(n!=0){
            int lastdigit = n%10;
            rev = rev*10 + lastdigit;
            n/=10;
        }

        int ans = Math.abs(temp - rev);

        return ans;
    }
}