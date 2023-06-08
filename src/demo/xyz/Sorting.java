package demo.xyz;

import java.util.Arrays;

public class Sorting {
	
	public static void main (String[]args)
	{   
		int a[]= {24,4,89,2,7,6,9,4,58,41,18,17};
		int []evenarray=new int[a.length];	
		int []oddarray=new int [a.length];
		
		int even_index=0;
		int odd_index=0;
		
		System.out.println("total number of elements in array is :"+a.length); 
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int c=0;
			   if(a[i]>a[j])			   
			   {
				   c=a[i];
				   a[i]=a[j];
				   a[j]=c;
			   }
			}
		if(a[i]%2==0){
		     evenarray[even_index++]=a[i]; 
		}else{
			oddarray[odd_index++]=a[i];	
		}
  }
		System.out.println("sorted array is :"+Arrays.toString(a));	
		System.out.println("odd number array is :"+Arrays.toString(oddarray));
		System.out.println("odd number length array is :"+oddarray.length);
		
		
		System.out.println("even number array is :"+Arrays.toString(evenarray));
		System.out.println("length of even array is "+evenarray.length);
		
		System.out.println("------------------------------------------------------------"); 
		int counteven=0;
		for (int i=0;i<evenarray.length;i++){
			if(evenarray[i]==0)
			{
				counteven++;
			}		
		}
		System.out.println("no of zero in array "+counteven);
	
		int new_length=evenarray.length-counteven;
		System.out.println("new  length of  array is "+new_length);
	     int []new_array=new int[new_length];
	     int s=0;
	     for (int i=0;i<new_array.length;i++)
	     {
	    	 new_array[s++]=evenarray[i]; 
	     }
	     System.out.println("new array of even  no  element is "+Arrays.toString(new_array));
	     
	     System.out.println("===================================================");
	    
			int countodd1=0;
			for (int z=0;z<oddarray.length;z++){
				if(oddarray[z]==0)
				{
					countodd1++;
				}
				}
			
			System.out.println("no of zero in array "+countodd1);
		
			int new_lengthodd=oddarray.length-countodd1;
			System.out.println("new  length of  array is "+new_lengthodd);
		     int []new_arrayodd=new int[new_lengthodd];
		     int r=0;
		     for (int f=0;f<new_arrayodd.length;f++)
		     {
		    	 new_arrayodd[r++]=oddarray[f]; 
		     }
		     System.out.println("new array of odd element is "+Arrays.toString(new_arrayodd));	
	}
	 

}
