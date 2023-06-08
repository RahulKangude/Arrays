package demo.xyz;

public class Pract2 {
	int i=10;
	static int j = 10;
	int []a;
	public static void main(String arg[])
	{
		Pract2 t1 = new Pract2();
	    t1.i = 888;
		j = 999;
		Pract2 t2 = new Pract2();
		t2.i=21;
		System.out.println(t2.i+" ----"+t2.j);
		System.out.println(t1.i+" ----"+t1.j);
		
		int i=2;
		if(arg.length > 0)
		{
		i = 10;
		}
		else
		{
		i = 20;
		}
		System.out.println(i);
		
		Pract2 t = new Pract2();
		System.out.println(t.a);
		System.out.println(t.a[0]); 

	}
}
