package anonymous;

public class Hello {
	
	public static void main (String[]argv)
	{
		
		final String q1="RAHUL";
		int [] s1= {10,52,95,89,14,62,35,75,46,58};
		
		int a= PrintArray(s1);
		System.out.println("varibalr "+a);
	
		//System.out.println("the value of constants" +s1);
		getName(q1);
	}
	static int PrintArray(int[] s1 )
	{  
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(" "+s1[i]);
		   int  rahul=(s1[i] * s1[i]);
		  // System.out.println("the value is "+rahul);	
		}
		return 1;     
	}
	static String q1="RAHUL";
	static String  getName(String jbl)
	{
          
	//String	q1=q1+123;
		System.out.println(" val____ ="+q1);
		return q1;
	}

}
