package demo.xyz;

public class Pract3 {
	int a=5;
	
  public Pract3(int a) {
       this.a=a;
		System.out.println("parameter"+a);
	}

	
  public Pract3() {
       //this.a=a;
		System.out.println("parameter"+a);
	}


public static void main(String[] args) {
	//Pract3 p=new Pract3(4);
	System.out.println();
	int k=0;
	int j=0;
	   k = (j = 10);
	 System.out.println("j is : "+j);
	 System.out.println("k is : "+k);
}
}
