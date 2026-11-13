// // import java.util.*;
// class Solution {
//     public boolean isPalindrome(int x) {
        
//         int ld = 0;
//         int rev = 0;
//         while(x!=0){
//             ld=x%10;
//             rev=(rev+ld)*10;
//             x/=10;
//         }
//         return (x==rev || x==rev/10);
//     }
// }
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}