package arraysdemo;

public class Tester {
  public static void main(String[]args) {
	/*Pattern pattern =Pattern .compile("M+",5);
	Matcher matcher =pattern.matcher("M Merit Match MM m mM");
	while(matcher.find()) {
		System.err.println(matcher.group()+" ");
	}*/
	  
	  String[] values = {"9a4b x","3a z","a", "1a2b3c "};
	  int counter=0;
	  for(String value:values) {
		  if (value.matches("(\\d[a-z])+\\s\\w?")){
		  		counter++;
	  }
		
}
	  System.out.println(counter);
}
}