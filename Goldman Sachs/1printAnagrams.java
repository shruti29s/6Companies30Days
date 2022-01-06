/*https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/ */

class printAnagrams {
    public List<List<String>> Anagrams(String[] string_list) {
        HashMap<String, List<Integer>> map=new HashMap<>();
        for(int i=0;i<string_list.length;i++)
        {
            char[] arr=string_list[i].toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);
            if(map.containsKey(str)==false)
            {
                map.put(str, new ArrayList<Integer>());
            }
            map.get(str).add(i);
        }
        List<List<String>> res=new ArrayList<List<String>>();
        for(Map.Entry<String, List<Integer>> e: map.entrySet())
        {
            res.add(new ArrayList<String>());
            List<Integer> arr=new ArrayList<Integer>(e.getValue());
            for(int i=0;i<arr.size();i++)
            {
                res.get(res.size()-1).add(string_list[arr.get(i)]);
            }
        }
        return res;
    }
}