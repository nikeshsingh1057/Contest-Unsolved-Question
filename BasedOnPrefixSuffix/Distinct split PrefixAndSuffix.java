// https://codeforces.com/contest/1791/problem/D
// this question is based on prefix and suffix 
// Note humko do part me he karna hai hence hum har eak index par disticnt calculate kar ke  prefix array me store kar lenge .
// similarly right side se suffix array me distinct calculate karenge 
// now prefix[i] + suffix[i+1]  se jo maximum answer find karnge.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t--!=0){
		    
		    int n=sc.nextInt();
		    String s=sc.next();
		    System.out.println(split(s,n));
		}
	}
	public static int split(String s,int n){
	    
	     HashSet<Character> hs=new HashSet<>();
	     int prefix[]=new int[n];
	     int suffix[]=new int[n];
	     
	     for(int i=0;i<n;i++){
	         
	         hs.add(s.charAt(i));
	         prefix[i]=hs.size();
	     }
	     hs=new HashSet<>();
	     for(int i=n-1;i>=0;i--){
	         
	         hs.add(s.charAt(i));
	         suffix[i]=hs.size();
	     }
	     int max=0;
	     for(int i=0;i<n-1;i++){
	         
	         max=Math.max(max,prefix[i]+suffix[i+1]); // prefix[i]+suffix[i+1] prefix me left split and suffix me right split.
	     }
	     return max;
	}

}
