package arraysdemo;

public class Uninitialized_Array {
    // int []x; //ex-1
	static int[]x;
     public static void main(String[]argv)
     { 
    	 
    	// ex- instance level
    	 //ex-1.1
    	 /*Uninitialized_Array a=new Uninitialized_Array();
    	 System.out.println(a.x);
         System.out.println(a.x[0]); //runtime java.lang.NullPointerException
         */
          //ex=1.2
         int [] a=new int[3];
         System.out.println(a[0]);
         System.out.println(a.length);
         
         //Ex- 2.1 static level
          System.out.println("the value is "+x);
          System.out.println(x[0]);
    	 
          //Ex-2
          
         /* int []b=new int [3];
          System.out.println(x);
          System.out.println(x[0]); *///runtime java.lang.NullPointerException
          
          //EX-1.1 local level 
          /*int []x;
          System.out.println(x); Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
          System.out.println(x[0]);	                The local variable x may not have been initialized
          */
          
          //EX-2 
        /*  Integer[]x=new Integer [3];
        
          System.out.println(x);
          System.out.println(x[1]);	
    	 
    	 */
     }
     
     
     
}
