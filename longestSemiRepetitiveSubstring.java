// 2730. Find the Longest Semi-Repetitive Substring
// https://leetcode.com/contest/biweekly-contest-106/problems/find-the-longest-semi-repetitive-substring/

class Solution {
    public int longestSemiRepetitiveSubstring(String str) {
        
        int max=Integer.MIN_VALUE;
        int j;
        for(int i=0;i<str.length();i++){
            
            int count=1;
            for(j=i+1;j<str.length();j++){
                
                if(str.charAt(j-1)!=str.charAt(j))
                    continue;
                
                else if(str.charAt(j-1)==str.charAt(j))
                    count++;
                
                if(count>2)
                    break;
            }
            max=Math.max(max,j-i);
        }
       
        return max;
    }
}
