/* https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1 */

class MaximumInSubarraysOfSizeK {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> b[0]-a[0]);
        for(int i=0;i<n;i++)
        {
            pq.offer(new int[]{arr[i], i});
            if(i+1>=k)
            {
                ans.add(pq.peek()[0]);
            }
            while(pq.size()>0 && i-pq.peek()[1]+1>=k)
            {
                pq.poll();
            }
        }
        return ans;
    }
}
