/* https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/ */

class countSubarraysLessThanK {
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int c=0;
        long p=1;
        int s=0, e=0;
        for(int i=0;i<n;i++)
        {
            p*=a[i];
            e=i;
            while(p>k)
            {
                p=p/a[s];
                s++;
            }
            if(p<k)
            {
                c+=1+e-s;
            }
        }
        return c;
    }
}
