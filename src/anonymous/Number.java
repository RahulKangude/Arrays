package anonymous;

public class Number {

	public static void main(String[] args) {
		
		int [] x = {10,15,32,46,59,65,70};  
		String s1="kangude " ;
		m2();
		System.out.println("total array element " +x.length);
		int c = 0;
		for(int  i=0;i<x.length;i++){
			if(x[i]%2==0)
			{   
				System.out.println( "even number is " +x[i]);
				c++;
			}

		}
		System.out.println("counter value is "+c);
	} 

	static void m2()
	{
		System.out.println("inside m2 method");


	}

	
	
}
	
	
    
