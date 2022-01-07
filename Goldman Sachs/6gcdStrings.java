/* https://leetcode.com/problems/greatest-common-divisor-of-strings/ */

class gcdStrings {
    public String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)==false)
            return "";
        int n=gcd(str1.length(), str2.length());
        return str1.substring(0, n);
    }
    
    public int gcd(int x, int y)
    {
        while(x>0)
        {
            int t=x;
            x=y%x;
            y=t;
        }
        return y;
    }
}
