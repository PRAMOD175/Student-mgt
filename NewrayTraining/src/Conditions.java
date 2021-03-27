
public class Conditions {
	
      private double n;

	Conditions(double n) 
      {
    	 this.n=n;
    	
    		 
      }
	void printinfo()
	{
		 if(1<=n && 10>=n)
		 {
			 System.out.println("number lies b/w 1 to 10");
		 }
		 else if(11<=n && 20>=n)
		 {
			 System.out.println("number lies b/w 11 to 20");
		 }
		 else if(20<n && 30>=n)
		 {
			 System.out.println("number lies b/w 21 to 20");
		 }
		 else if(31<n && 40>=n)
		 {
			 System.out.println("number lies b/w 31 to 40");
		 }
		 else if(41<n && 50>=n)
		 {
			 System.out.println("number lies b/w 41 to 50");
		 }
		 else 
		 {
			 System.out.println("number you have entered is 0");
		 }
	}
}
