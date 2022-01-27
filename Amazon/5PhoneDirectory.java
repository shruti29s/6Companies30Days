/* https://practice.geeksforgeeks.org/problems/phone-directory4628/1/ */

class PhoneDirectory {
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        HashSet<String> con=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            con.add(contact[i]);
        }
        contact=new String[con.size()];
        int i=0;
        for(String x: con)
        {
            contact[i++]=x;
        }
        Arrays.sort(contact);
        ArrayList<ArrayList<String>> ans=new ArrayList<ArrayList<String>>();
        for(i=0;i<s.length();i++)
        {
            ans.add(new ArrayList<String>());
        }
        for(i=0;i<con.size();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(j<contact[i].length() && contact[i].charAt(j)==s.charAt(j))
                    ans.get(j).add(contact[i]);
                else
                    break;
            }
        }
        for(i=0;i<s.length();i++)
        {
            if(ans.get(i).size()==0)
            {
                ans.get(i).add("0");
            }
        }
        return ans;
    }
}
