 class Student
{
	 private int regno;
	 private int age;
	 private String college;
	 private String name;
	 private int marks;
	 
	 
	Student( int regno,int age,String college,String name)
	  {
		  this.regno=regno;
		  this.age=age;
		  this.college=college;
		  this.name=name;
	  }
	Student( int regno,int age,String college,String name,int marks)
	{
		this( regno, age, name, college);
		this.marks=marks;
	}
	  public void printdata()
	{
		 System.out.println(regno);
		 System.out.println(age);
		 System.out.println(college);
		 System.out.println(name);	 	 
	}
	  void printwithmarks()
	  {
		  this.printdata();
		  System.out.println(marks);
	  }
	/*void getregno()
	{
		System.out.println("regno="+regno);
	}
	 void getname()
	{
		System.out.println("college=" +college);
	}
	 int getdata()
	{
		return regno;
		
	}
		
	public String toString()
	{
		return regno+" "+age+" "+college+" "+name;
	}
	public int hashCode() {
		return regno;
	}*/	
}
public class Driver {
	public static void main(String[] args) {
		Student s=new Student(101,19,"BIT","pk");
		s.printdata();
		Student s1=new Student(101,19,"gj","gg",123);
		s1.printwithmarks();
		
		
		
		
		
	/*	s.getregno();
		s.getname();
		System.out.println(s.getdata());
		System.out.println(s.toString());
		System.out.println(s.hashCode());*/
		
		
		
	}

	@Override
	public String toString() {
		return "Driver [toString()=" + super.toString() + "]";
	}
}
