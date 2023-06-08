package anonymous;

import java.util.Arrays;

public class Assignment {
	//case1 -primitive type array
	public static void main(String[] args) {
		   int []x=new int [6];
		   x[0]=10;
		   x[1]='a';
		   byte b=20;
		   x[2]=b;
		   short S=30;
		   x[3]=S;
		   //x[4]= 10l;//long
		   System.out.println(x);
	
		  // case2- object type array
		   Object  []a=new Object[10];
		   a[0]=new Object();
		   a[1]=new String("RAHUL");
		   a[2]=new Integer[10];
		   System.out.println(a[2]);
		   System.out.println(a);
		   
		   // abtract class
		   
		  //  Number[]n1=new Number[10];
		   //n1[1]= new Integer(10);
		  // n1[5]= new Double(10.12);
		   //n[2]=new String("RAHUL");//Not allowed
		   
		   //runnable
		  // Runnable []r=new Runnable[10];
		  // r[0]=new Thread();
		  // r[1]=new String("RAHUL");
	   
		   
		   
	}
	

}



class A{
	static int count=0;
	public static void main(String[] args) {
//		Arrays.sort(z);
//		System.out.println(Arrays.toString(z));
		Integer [] z= {20,65,7,4,1,78,3,4};
		int[] z1= new int[z.length];
		 
		for (int i = z.length-1; i >=0; i--) {
			 
			z1[count++]=z[i];
		}
		System.out.println(Arrays.toString(z1));
		
		
		
	}
}


















