// Minimum Operations to Make a Special Number . isme hum divisible by 25 banana hai number given minimum operation me number delete kar ke.
// https://leetcode.com/problems/minimum-operations-to-make-a-special-number/

class Solution {
    public int minimumOperations(String str) {
        
        if(str.length() == 1) return 1;
        
        if(str.length()==2)
        {
            if( str.equals("75") || str.equals("25")||str.equals("00")||str.equals("50"))
               return 0;
            if(str.charAt(0)=='0' || str.charAt(1)=='0')
                return 1;
            else
                return 2;
        }
        
        int l=str.length()-1;
        
        int zero=Integer.MAX_VALUE;
        int tf=Integer.MAX_VALUE;
        int fz=Integer.MAX_VALUE;
        int sf=Integer.MAX_VALUE;
        int count=Integer.MAX_VALUE;
        
        for(int i=0;i<str.length();i++){
            
            for(int j=i+1;j<str.length();j++){
                
                String t="";
                
                t += str.charAt(i);
                t += str.charAt(j);
                
                //System.out.print(t+" ");
                if(t.equals("00")){
                    
                    int cnt=j-i-1+ l-j;
                    zero=Math.min(zero,cnt);
                }
                else if(t.equals("25")){
                    
                     int cnt=j-i-1+ l-j;
                     tf=Math.min(tf,cnt);
                }
                else if(t.equals("50")){
                    
                     int cnt=j-i-1+ l-j;
                     fz=Math.min(fz,cnt);
                }
                
                else if(t.equals("75")){
                    
                    int cnt=j-i-1+ l-j;
                     sf=Math.min(sf,cnt);
                 }
                
            }
        }
        
        int ans=min(zero,tf,fz,sf);
       
        if(ans!=Integer.MAX_VALUE)
            return ans;
        if(str.indexOf("0")!=-1)
            return str.length()-1;
        return str.length();
    }
    // function to calculate maximum.
    public static int min(int... arr){
        
        int min=arr[0];
        for(int ele:arr){
            min=Math.min(min,ele);
        }
        return min;
    }
}
