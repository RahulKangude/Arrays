package demo.xyz;

import java.util.Arrays;

public class Sorting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		int[]a= {22,45,82,53,5,20,0,0,15,45,0,17,23,0,56,0,0,47};
		  int s=0;
	       for(int k=0;k<a.length;k++)
	       {
	    	   if(a[k]==0) {
	    	      s++;
	    	   }}
		System.out.println("total length is :"+a.length);
		   int []w=new int[s];
		   int t=0;
			   for(int i=0;i<w.length;i++){
					 if(a[i]==0) {}
					 else {
						w[t]=a[i]; 
						t++;
					}
					 //System.out.println(Arrays.toString(w));
					 
			   }
			  //System.out.println(Arrays.toString(w));
		
	       int arrlength= a.length-s;
	       int []newarr=new int[arrlength] ;
	       int t1=0;
	       for(int r=0;r<a.length;r++)
	       {   
	    	   if(a[r] != 0) {
	    	   newarr[t1]=a[r];
	    	   t1++;
	    	   }
	       }
	       
	       System.out.println(Arrays.toString(newarr));
	       
	       
	}
	
}
