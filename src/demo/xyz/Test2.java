package demo.xyz;

import java.util.Arrays;

public class Test2 {
		public static void main(String[] args) {
		
			   String[] a= {"RAHUL","VAIBHAV","MARRISH","PRANAV","PRTNAV","PNAV"};
			   Arrays.sort(a);
               System.out.println(Arrays.toString(a));
			   
			  
			   for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a.length;j++)
					{	
						String b="0";	
						if(a[i].compareTo(a[j])<0)
						{
							b=a[i];
							a[i]=a[j];
							a[j]=b;
						}
					}	
				} 		
			   System.out.println("sorted array is "+ Arrays.toString(a));
				
	}

}
