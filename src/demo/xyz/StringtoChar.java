package demo.xyz;

import java.util.Arrays;

public class StringtoChar {

	public static void main(String[]args)
	{
		String s="INDIAN PREMIER LEAGUE";
		String[] world=s.split(" ");
		System.out.println("convert into string to array  array "+Arrays.toString(world));
		for (int i=0;i<world.length;i++) {
			System.out.print( world[i]);
		}
		System.out.println();
		  char  []c= {'e','d','a','h','j'};
		  for(int i=0;i<c.length;i++) {
			  System.out.print(c[i]); 
		  }
		  System.out.println();
		char[]arr=s.toCharArray();
		System.out.println(" to convert into string to char array "+Arrays.toString(arr));
	  m1();  
	}
	static void m1()
	{
		String s1=  "*************** maharastra  police **********";
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='*') {}
			else if(s1.charAt(i)==' ')
				
			{	
			}else {
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println("the final String is: "+s2);
	}
	
}
