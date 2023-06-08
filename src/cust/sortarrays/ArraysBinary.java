package cust.sortarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysBinary {
  public static void main(String[] args) {
	int a[]= {12,89,34,35,45,7,54,78};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.binarySearch(a, 35));//3 position
	System.out.println(Arrays.binarySearch(a, 4));//fit into before 7 hence -1 
	
	String []s= {"R","A","H","U","L"};
	Arrays.sort(s);
	System.out.println(Arrays.toString(s));
	System.out.println("A position "+Arrays.binarySearch(s, "A"));
	System.out.println("G fitted into position after A "+Arrays.binarySearch(s, "G"));
	
	Arrays.sort(s, new MyHp());
	System.out.println(Arrays.binarySearch(s, "L",new MyHp()));
	System.out.println(Arrays.binarySearch(s, "R",new MyHp()));
	System.out.println(Arrays.binarySearch(s, "L"));
	
	
	
	String []arr= {"A","B","H"};	
	List<String> lits1=Arrays.asList(arr);
	ArrayList<String>str=new ArrayList<String>(lits1);
	str.add("rahul");
	System.out.println(str);
}
}

class MyHp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
	    String s2=o2.toString();
		return s2.compareTo(s2);
	}
	
}