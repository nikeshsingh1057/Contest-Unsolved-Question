// https://leetcode.com/contest/weekly-contest-355/problems/split-strings-by-separator/
// Split Strings by Separator
class Solution {
    public List<String> splitWordsBySeparator(List<String> ll, char sep) {
        
        List<String> ans=new ArrayList<>();
        
        for(int i=0;i<ll.size();i++){
            
            String str=ll.get(i);
            
            String s="\\";    //note here split function specila case ko direct spilt nahi karta hai uske liye pahele ye "\\" lagana hota hai
                s+=sep;
            String [] arr = str.split(s);
            
            for(int j=0;j<arr.length;j++){
                if(arr[j].length()>0)
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}
