/* https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1 */

class PatternID
{
    static String printMinNumberForPattern(String S){

        /*********** METHOD 1 ******************* */

        String ans="";
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=S.length();i++)
        {
            st.push(i+1);
            if(i==S.length() || S.charAt(i)=='I')
            {
                while(st.isEmpty()==false){
                    ans+=st.pop();
                }
            }
        }
        return ans;

        /*********** METHOD 2 ******************* */

    }
}