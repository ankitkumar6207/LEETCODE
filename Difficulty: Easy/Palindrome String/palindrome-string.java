//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        // String str = S;
        String rev ="";
        int len = S.length();
        
        char[] arr = S.toCharArray();
        int start = 0;
        int end = len - 1;
        while(start < end)
        {
            if(arr[start] != arr[end])
            {
                return 0;
            }start++;
            end--;
        }
        return 1;
        
        // for(int i = len-1;i>=0;i--)
        // {
        //      rev = rev + S.charAt(i); 
        // }
        // if(rev.equals(S)){
        //     return 1;
        // }else{
        //     return 0;
        // }
    }
};