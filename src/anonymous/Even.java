package anonymous;

public class Even {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = {10,15,32,46,59,65,70};

		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				System.out.println("even no is "+x[i]);
			}
		}
	}
}

class Anno {

	//new int[] {10,20,30};
	
		public static void main(String arg[])
		{
			System.out.println(sum(new int[]{10,20,30,40,774}));
		}
		public static int sum(int[] a)
		{
			int total = 0;
			for(int i = 0; i< a.length;i++)
			{
				total = total + a[i];
			}
			return total;
		}
	}
