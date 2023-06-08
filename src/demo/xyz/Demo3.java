package demo.xyz;

public class Demo3 {
	
	int age ;
	int name;
	
	 Demo3(int age ,int name){
		 this .age=age;
		 this .name=name;
}
}
 class child extends Demo3{

	 int collge ;
	 int room;
	 
	child(int age, int name,int collge,int room) {
		super(age, name);
		System.out.println(age);
		
	}
	 
 }
 class child1 extends child{

	child1(int age, int name, int collge, int room) {
		super(age, name, collge, room);
		
	}
	 
 }