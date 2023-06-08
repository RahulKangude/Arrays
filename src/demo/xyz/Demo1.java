package demo.xyz;

import java.util.Arrays;

public class Demo1 {
	static int []a= {21,24,358,35,521,563,531,422,470,746,138,59,2215,4,45,12};
	
	public static void main(String[] args) {
		System.out.println("total number of arrays element is "+a.length);
		
		sum(a);
		maxValue(a);
		minvalue(a);
		median(a);
		m1(a);	
	}
	static void  sum(int []a)
	{
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		System.out.println("the sum of array is "+s);
	}
     static  void maxValue(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{	
				int b=0;	
				if(a[i]<a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}	
		} 		
		System.out.println("sorted array is "+ Arrays.toString(a));
		System.out.println("\nthe highest value  of array is "+a[a.length-1]);
		System.out.println("the lowest  value  of array is "+a[a[0]]);
	}    
     static void minvalue(int[]a)
     {
    	 for(int i=0;i<a.length;i++)
    	 {
    		 for(int j=0;j<a.length;j++)
    		 {
    			  int c=0;
    			 if(a[i]>a[j])
    			 {
    				c=a[j];
    				a[j]=a[i];
    			     a[i]=c;
    			 } 
    		 }
    	 }
    	 System.out.println("minimum value is "+a[a.length-1]);
     }     
    static void median(int[]a)
    {	
    	System.out.println("the median value of array is  "+a[a.length/2]);
    	System.out.println();
    }
    static void m1(int[]a)
    {
    	int [] evenarray=new int [a.length];
    	int[] oddarray=new int  [a.length];
    	int evenIndex=-1;
    	int oddIndex=-1;
    	//System.out.println("[");
    	int countE=0;
    	int countO=0;
   
    	for(int i=0;i<a.length;i++)
    	{ 
    		
    	
    		if(a[i]%2==0)
    		{//System.out.println("the even num "+a[i]);
    			evenarray[++evenIndex]=a[i];
    			countE++;
    			    	    }
    		else
    		{
    			oddarray[++oddIndex]=a[i];
    			countO++;
    		}
    	}
    	
    	int []q=new int [countE++];
    	System.out.println(Arrays.toString(q));
  
    	System.out.println("even num is "+Arrays.toString(evenarray));
    	System.out.println("odd num is "+Arrays.toString(oddarray));
    }
    
	
	
}
