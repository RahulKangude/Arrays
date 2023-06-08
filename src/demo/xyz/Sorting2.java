package demo.xyz;

import java.util.Arrays;

public class Sorting2 {
  public static void main (String []args)
  {
	  int []arr= {0,0,0,45,89,4,12,14,241,35,47,0,0,9,5,125,1,74,2,95,0,0,0,0,0,0,}; 
	  int even=0;
	  int odd=0;
	    for(int i=0;i<arr.length;i++)
	    {  
	    	if(arr[i]==0) {}
	   else if(arr[i]%2==0){
	    		even++;
	    	}
	    	else {
	    	odd++;	
	    	}
	    }
	    int evenarr[]=new int[even];
	    int oddarr[]=new int[odd];
	    int a=0;
	    int b=0;
	       for(int j=0;j<arr.length;j++)
	       {
	    	   if(arr[j]==0) {}
	    	   else if (arr[j]%2==0)
	    	   {
	    		  evenarr[a++]=arr[j];
	    	   }
	    	   else {
	    		   oddarr[b++]=arr[j];
	    	   }
	       }
	    System.out.println("even array is "+Arrays.toString(evenarr));
	    System.out.println("even array is "+Arrays.toString(oddarr));
	    
	  
	  
	  
	  
  }
	
	
	
}
