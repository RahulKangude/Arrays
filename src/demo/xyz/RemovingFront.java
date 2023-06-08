package demo.xyz;

import java.util.Arrays;

public class RemovingFront {
	public static void main(String[] args) {

		int[] a = { 0, 0, 0, 0, 0, 6, 2, 4, 5, 8, 9, 8 };
		System.out.println("new array element is " + Arrays.toString(a));

		System.out.println("total length of old array is " + a.length);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
		}
		System.out.println("no of zero in array " + count);

		int new_length = a.length - count;
		System.out.println("new  length of  array is " + new_length);
		int[] new_array = new int[new_length];
		int s = 0;

		for (int i = count; i < a.length; i++) {
			new_array[s++] = a[i];

		}
		System.out.println("new array element is " + Arrays.toString(new_array));
	}

}
