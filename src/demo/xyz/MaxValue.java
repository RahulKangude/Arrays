package demo.xyz;

public class MaxValue {

	
	static int max=Integer.MIN_VALUE;


	public static void main(String[] args) {
		System.out.println(max);
		
		   int []a= {56,23,52,11,24,25,74,89,41,5,1,22,111};
		   
		   int c=0;
		   for (int i=0;i<a.length;i++)
		   {
			   if(a[i]>max)
			   {
				   max=a[i];
			   }
			   
			   
			   
		   }  
		   System.out.println(max);
		   
		   

	}

}
