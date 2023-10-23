 // using prexi method see vedio on youtube if not understand.
// https://practice.geeksforgeeks.org/problems/adding-ones3628/1
class Solution {  

    public static void update(int arr[], int n, int up[], int k)
    {
        for(int i=0;i<k;i++)
            up[i]=up[i]-1;
        
        for(int i=0;i<k;i++){
            arr[up[i]]++;
        }
        
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }
    
}
