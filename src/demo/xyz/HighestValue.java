package demo.xyz;

import java.util.Arrays;

public class HighestValue {

	public static void main(String[] args) {
		int [] a= {56,1,345,478,58814,848478,85,8,48,878,774,7478,54};
		
		int temp;
		for(int i=0;i<a.length-1;i++)				
		{
		     for(int j=i+1;j<a.length;j++)
		     {
		    	if(a[i]>a[j] ){
		    		temp=a[i];
		    		a[i]=a[j];
		    		a[j]=temp;
		    	}
		    	
		     }
  
		}		
		 System.out.println("the maxmimum element "+a[a.length-1]);
		 System.out.println("the maxmimum element "+Arrays.toString(a));
	}

} 
