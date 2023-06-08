package demo.xyz;

import java.util.Arrays;

public class Pract1 {
    public static void main(String[] args) {
    	
    	
    	int []arr= {1,89,4,2,7,0,9,8,0,24,2,0,246,48,513,85,0};
    	
    	int count=0;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) { count++;}
		}
    	System.out.println(count);
		int newlength= arr.length-count;
    	int[] arr1=new int [newlength];
    	int r=0;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {}
			else {
				arr1[r++]=arr[i];
			}
	}
    	System.out.println("old array: "+Arrays.toString(arr));
    	System.out.println("new array: "+Arrays.toString(arr1));
    	int temp=0;
    	for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr1[i]<arr1[j]) {
				   temp=arr1[i];
				   arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
    	System.out.println(" sorted array :"+Arrays.toString(arr1));
}
}