/* https://practice.geeksforgeeks.org/problems/deee0e8cf9910e7219f663c18d6d640ea0b87f87/1/ */

class IPL {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
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
