package demo.xyz;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		char []a= {'d','f','a','i','b'};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{	
				char b=0;	
				if(a[i]< a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}	
		} 		
		System.out.println("sorted array is "+ Arrays.toString(a));
		System.out.println("\nthe highest value  of array is "+a[a.length-1]);

		char[]arr= {'r','a','h','u','l'};
		String s=" ";
		for (int i = 0; i < arr.length; i++) {
			s=s+arr[i];
		}
		System.out.println(s);
		
		int d=12;
		System.out.println(d);
		
	}

}
