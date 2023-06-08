package demo.xyz;

import java.util.Arrays;

public class Minvalue {

	public static void main(String[] args) {

		String[] f1= {"rahul","om","pranav","aditya"};

		String s2="rahul";
		System.out.println(s2.length());//to find the length of String '
		System.out.println("the 2th element is "+f1[2]);

		System.out.println("the arrr is..... "+Arrays.toString(f1));// print the all element in array.
		int []s1= {12,56,58,451,466,489,565,12,1,2,95,1,4,0,65,62,26,56,5,57};
		Arrays.sort(s1);

		System.out.println("sorted array is "+Arrays.toString(s1));
		System.out.println("the total number of arrys element is -----"+s1.length);
		System.out.println();
		int sum = 0;
		int c=0;
		for (int i=0;i<=s1.length-1;i++)

		{
			sum=sum+s1[i];
			c++;
		}
		System.out.println("counter is"+c++);
		System.out.println(sum);
        int []arr=new int[c++];
		int temp=0;
		for(int i=0;i<=s1.length-1;i++)
		{     for(int j=i+1;j<=s1.length-1;j++)
		{
			if(s1[i]>s1[j])
			{
				temp=s1[i];
				s1[i]=s1[j];
				s1[j]=temp;			
			} 
		}
		System.out.println("highest number is "+s1[s1.length-1]);
		System.out.println("min number is "+s1[0]);
	}		
}
}
