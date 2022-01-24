/* https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1/ */

class Max10Numbers {
    int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            minHeap.add(arr[i]);
        }
        for(int i=k;i<n;i++)
        {
            if(minHeap.peek()<arr[i])
            {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        int ans[]=new int[k];
        for(int i=k-1;i>=0;i--)
        {
            ans[i]=minHeap.poll();
        }
        return ans;
    }
    
}
