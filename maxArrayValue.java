// Largest Element in an Array after Merge Operations
//https://leetcode.com/contest/weekly-contest-355/problems/largest-element-in-an-array-after-merge-operations/

class Solution {
    public long maxArrayValue(int[] nums) {
        
        return answer(nums);
    }
    // logic make sum form previsiouly and store it in max value.
    // hum array ko piche se travesh karenge and sum store karate jayenge.
    public static long answer(int arr[]){
        
        int len=arr.length;;
        long elementLast=arr[len-1];;      
        long max=0;;
        ;
        for(int i=len-2;i>=0;i--){
            
            if(arr[i]<=elementLast){
                
                elementLast+=arr[i];;
                max=Math.max(max,elementLast);;
            }
            else{

                 elementLast=arr[i];;
            }
        }
        max=Math.max(max,elementLast);;
        return max;
    }
}
