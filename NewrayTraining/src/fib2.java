
public class fib2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int n3;
		int i=2;
		System.out.println(n1);
		System.out.println(n2);
		
		while(i<5)
			
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			i++;
			
			
		}

	}

}
