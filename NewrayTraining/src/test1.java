import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
		 */
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of n");
      int n =sc.nextInt();
      if(0==n%2)
      {
          System.out.println("Weird");
      }
      else
      {
          if(n<=2 && 5<=n)
          {
              System.out.println("Not Weird");
          }
          else if(6<=n && 20>=n)
          {
              System.out.println("Weird");
          }
          else if(n<0)
          {
              System.out.println("negative number");
          }
          else
          {
        	  System.out.println("Not weired");
          }
      }
      
	}

}

