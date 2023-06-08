package demo.xyz;

import java.util.Arrays;

public class Sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,0,24,4,89,2,0,0,7,6,9,40,0,0,0,58,41,0,18,17,0,0};
		int even = 0;
		int odd = 0;
		for (int i=0;i<a.length;i++) {
			if (a[i]==0) {}
			else if(a[i]%2==0) {
				even ++;
			}
			else {
				odd ++;
				}}
		int a_even[] = new int [even];
		int a_odd[] = new int [odd];
		System.out.println((even));
		int c1 = 0;
		int c2 = 0;
		for (int i=0;i<a.length;i++) {
			if(a[i]==0) {}
			else if(a[i]%2==0) {
				a_even[c1] = a[i] ;
				
				c1++;
			}
			else {
				a_odd[c2] = a[i];
				c2++;
			}
		}
		System.out.println(Arrays.toString(a_even));
		System.out.println(Arrays.toString(a_odd));
	}
	

}
