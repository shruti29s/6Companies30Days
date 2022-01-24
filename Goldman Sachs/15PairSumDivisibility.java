/* https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1 */

class PairSumDivisibility {
    public boolean canPair(int[] nums, int k) {
        int n=nums.length;
        if(n%2!=0)
            return false;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i]%k, map.getOrDefault(nums[i]%k, 0)+1);
        }
        for(int i=0;i<n;i++)
        {
            int x=nums[i]%k;
            if(2*x==k)
            {
                if(map.get(x)%k==1)
                    return false;
            }
            else if(x==0)
            {
                if(map.get(x)%2==1)
                    return false;
            }
            else
            {
                if(map.get(x)!=map.get(k-x))
                    return false;
            }
        }
        return true;
    }
}
