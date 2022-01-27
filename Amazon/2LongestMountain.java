/* https://leetcode.com/problems/longest-mountain-in-array/ */

class LongestMountain
{
    public int longestMountain(int[] arr) {
        int i=0, ans=0;
        while(i<arr.length)
        {
            int start=i;
            while(i<arr.length-1 && arr[i]<arr[i+1])
                i++;
            if(i==arr.length-1)
                return ans;
            int peek=i;
            while(i<arr.length-1 && arr[i]>arr[i+1])
                i++;
            if(peek!=start && peek!=i)
                ans=Math.max(ans, i-start+1);
            if(i==start)
                i++;
        }
        return ans;
    }
}