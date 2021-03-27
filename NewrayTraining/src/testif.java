import java.util.Scanner;

public class testif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
		
			System.out.println("enter the number");
			double n=sc.nextDouble(); 
			 if(50<n)
		       {
			      System.out.println("number is greater than 50");
		       }
		       else if(0>n)
		       {
			      System.out.println("Enter positive number");
		       }
		       else
	        	{
		        	Conditions c=new Conditions(n);
			        c.printinfo();
	        	}
		       
		}
		catch (Exception e )
		{
			System.out.print("enter only integer values" );
		}
		
		      
	}

}		
		
		
		


