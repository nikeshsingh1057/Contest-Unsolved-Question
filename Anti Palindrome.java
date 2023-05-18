// https://www.codechef.com/problems/ANTIPALINDR?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    
	    while(t--!=0){
	         
	        int n=sc.nextInt();
	        String str=sc.next();
	        
	        if(str.length()%2==0){
	            
	            int ans=even(str);
	            System.out.println(ans);
	        }
	        else{
	            
	            int ans=odd(str);
	            System.out.println(ans);
	        }
	    }
	}
	public static int even(String str){
	    
	    int arr[]=new int[26];
	    
	    for(int i=0;i<str.length();i++){
	        
	        arr[str.charAt(i)-'a']++;
	    }
	    
	    
	    for(int i=0;i<26;i++){
	        
	        if(arr[i]==0)
	            continue;
	            
	        if(arr[i]%2!=0)
	            return 0;
	    }
	    return 1;
	}
	public static int odd(String str){
	    
	    int arr[]=new int[26];
	    
	    for(int i=0;i<str.length();i++){
	        
	        arr[str.charAt(i)-'a']++;
	    }
	    int odd=0;
	    int pld=0;
	    int eve=0;
	    
	    for(int i=0;i<26;i++){
	        
	        if(arr[i]==0)
	            continue;
	            
	        if(arr[i]%2!=0)
	            odd++;
	        else
	            eve++;
	    }
        if(eve==0 && odd==1)
            return 2;
	    if(odd==1)
	        pld++;
	        
	    if(pld==1)
	        return 1;
	    else
	        return 0;
	    
	}
}
