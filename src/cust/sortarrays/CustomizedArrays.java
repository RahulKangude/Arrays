package cust.sortarrays;

import java.util.Arrays;
import java.util.Comparator;

public class CustomizedArrays {
  public static void main(String[] args) {
	int a[]= {20,56,11,02,43,1,25,52};
	   Arrays.sort(a);
	   System.out.println("integer sort "+Arrays.toString(a));
	   
	String [] s= {"f", "r","a","e","b"};
		 Arrays.sort(s);
//	 System.out.println("sorting String "+Arrays.toString(s));
	
	 for(String s1:s) {
		 System.out.print(s1);
	 }
	 System.out.println();
	
	Arrays.sort(s, new Mycust());
	System.out.println("comparator");
	for(String s1:s)	{
		System.out.print(s1);
		
		
	}
}
}

class Mycust implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String S1= o1.toString();
		String S2= o1.toString();
		int Name=S1.compareTo(S2);
		return Name;
	}
	
}