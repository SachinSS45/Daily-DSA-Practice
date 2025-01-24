/**
 * Q.11 : Count Primes In Range : 
 * GFG Link : https://www.geeksforgeeks.org/problems/count-primes-in-range1604/0
 */

class Solution {
    int countPrimes(int L, int R) {
        // code here
        int[] prime = new int[R+1];
        
        for(int i=2;i<=R;i++){
            prime[i] = 1;
        }
        
        for(int i=2;i*i<=R;i++){
            if(prime[i]==1){
                
                if(i>Integer.MAX_VALUE/i){
                    continue;
                }
                int j = i*i;
                
                while(j<=R){
                    prime[j] = 0;
                    j+=i;
                }
            }
        }
        int count = 0;
        for(int i=L;i<=R;i++){
            if(prime[i]==1){
                count++;
            }
        }
        return count;
    }
};
