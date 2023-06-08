package arraysdemo;

public class Jungle1 {

	public static void main(String[] args) {
	
	   String []animals=new String [12];
	   String animal_name[]={"lion","deer","rabit","monkey","elephan"};
	   int []num=new int [6];
	   num[0]=10;
	   num[1]='a';
	   num[2]=20;
	   num[3]=40;
	   num[4]=60;
	   num[5]=22;
	   
	   
	   System.out.println((num[1]));
	    for(int i= 0;i<=5;i++)
	   {
		   System.out.println("value of  forward array is : "+num[i]);
		   
	   }  
	    System.out.println("***************************************");
	    for(int i=5;i>=0;i--)
	    {
	    	System.out.println("value is reverse array is  : "+num[i]);
	    }
	    System.out.println("***************************************");
	    	
	   	   for( int i=4;i>0;i--)
	   {
		   
		   System.out.println("animal names is ; "+animal_name[i]);
	   }
	}
}
