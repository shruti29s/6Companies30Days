/* https://practice.geeksforgeeks.org/problems/decode-the-string2444/1 */

class DecodeString {
    static String decodedString(String s){
        Stack<String> st=new Stack<String>();
        for(int i=0;i<s.length();i++)
        {
            String str=s.substring(i, i+1);
            if(str.equals("]"))
            {
                String sub="";
                while(st.peek().equals("[")==false)
                {
                    sub=st.pop()+sub;
                }
                st.pop();
                String n="";
                while(st.isEmpty()==false && Character.isDigit(st.peek().charAt(0)))
                {
                    n=st.pop()+n;
                }
                String res="";
                int num=Integer.parseInt(n);
                for(int j=1;j<=num;j++)
                {
                    res+=sub;
                }
                st.push(res);
            }
            else
            {
                st.push(str);
            }
        }
        String ans="";
        while(st.isEmpty()==false)
        {
            ans=st.pop()+ans;
        }
        return ans;
    }
}
