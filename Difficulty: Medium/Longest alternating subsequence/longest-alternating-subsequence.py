#User function Template for python3
class Solution:
    # Function to find the maximum length of alternating subsequence
   def alternatingMaxLength(self, arr):
        n = len(arr)
        up, down = True, True
        ans = 1
        for i in range(1,n):
            if up and arr[i] > arr[i-1]:
               ans += 1
               up, down = False, True
            elif down and arr[i] < arr[i-1]:
                ans += 1
                up, down = True, False
        return ans


#{ 
 # Driver Code Starts
if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    data = input().splitlines()

    tc = int(data[0])
    for i in range(1, tc + 1):
        s = data[i].strip().split()
        nums = list(map(int, s))
        obj = Solution()
        ans = obj.alternatingMaxLength(nums)
        print(ans)

# } Driver Code Ends