/* https://leetcode.com/problems/minimum-size-subarray-sum/ */

class MinimizeSizeSubSum {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int start=0, sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                ans=Math.min(ans, i+1-start);
                sum-=nums[start];
                start++;
            }
        }
        if(ans==Integer.MAX_VALUE)
            return 0;
        return ans;
    }
}
