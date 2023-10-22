// https://leetcode.com/problems/minimum-sum-of-mountain-triplets-ii/
// Minimum Sum of Mountain Triplets II

class Solution {
    public int minimumSum(int[] arr) {
        
        int n=arr.length;
        int prefixMin[]=new int[n];
        int suffixMin[]=new int[n];
        int ans=Integer.MAX_VALUE;
        
        prefixMin[0]=arr[0];
        suffixMin[n-1]=arr[n-1];
        
        for(int i=1;i<n;i++){
            prefixMin[i]=Math.min(prefixMin[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            suffixMin[i]=Math.min(suffixMin[i+1],arr[i]);
        }
        //System.out.println(Arrays.toString(prefixMin));
        //System.out.println(Arrays.toString(suffixMin));
        for(int i=1;i<n-1;i++){
            
            if(prefixMin[i-1]<arr[i] && arr[i]>suffixMin[i+1]){
                ans=Math.min(ans,prefixMin[i-1]+suffixMin[i+1]+arr[i]);
            }
        }
        return ans==2147483647?-1:ans;
    }
}
