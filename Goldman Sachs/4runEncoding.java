/* https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/ */

class runEncoding {
    String encode(String str)
	{
	    char ch=str.charAt(0);
	    int c=1;
	    String res="";
	    for(int i=1;i<str.length();i++)
	    {
	        if(ch!=str.charAt(i))
	        {
	            res+=ch;
	            res+=c;
	            c=1;
	            ch=str.charAt(i);
	        }
	        else
	        {
	            c++;
	        }
	    }
	    res+=ch;
	    res+=c;
	    return res;
	}
}
