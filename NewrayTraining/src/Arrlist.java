import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
      Studentarr s1=new Studentarr(101,"pramod","MCA","kumar");
      Studentarr s2=new Studentarr(102,"theju","MBA","shivraj");
      Studentarr s3=new Studentarr(103,"vinay","MBA","raju");
      Studentarr s4=new Studentarr(104,"chethan","MCA","lingraju");
      Studentarr s5=new Studentarr(105,"varun","BSC","akash");
      Studentarr s6=new Studentarr(106,"mithu","BE","mahesh");
      Studentarr s7=new Studentarr(107,"suman","BCA","prakesh");
      Studentarr s8=new Studentarr(108,"kiran","BE","nagraj");
      Studentarr s9=new Studentarr(109,"krishna","MCA","nagendra");
      Studentarr s10=new Studentarr(110,"bharath","MCA","kumar");
      ArrayList<Studentarr> list=new ArrayList<Studentarr>();
      {
    	  list.add(s1);
    	  list.add(s2);
    	  list.add(s3);
    	  list.add(s4);
    	  list.add(s5);
    	  list.add(s6);
    	  list.add(s7);
    	  list.add(s8);
    	  list.add(s9);
    	  list.add(s10);
    	  
      }
      for(Studentarr s: list)
      {
    	  s.toString();
    	 //System.out.println("id="+ s.id+"\t "+"name="+s.name+"\t "+"class="+s.classname+"\t "+"fathername="+s.fathername); 
      }
      int id1;
      String name1;
    String classname1;
      String fathername1;
     System.out.println("enter name");
      name1=sc.nextLine();
    System.out.println("enter id");
      id1=sc.nextInt();
   System.out.println("enter class name");
    classname1=sc.next();
     System.out.println("enter fathername");
      fathername1=sc.next();
   
     
     int flag=0;
     
       for(Studentarr s: list)
       {
    	   
       	if(s.name.equals(name1) && s.fathername.equals(fathername1) )
       	{
       		System.out.println("name and fathername matched");
       		flag=1;
       	}
     
       }
       if(flag==0)
       {
    	   System.out.println("name and father name not matched");
       }
       
       for(Studentarr s: list)
       {
   	   
       	if(s.id==id1 )
       	{
       		System.out.println("ID is matched");
       		
       	}
     
       }
      
          
    	
       
       
     
//       	else if(s.name==name1 || s.id==id1)
//       	{
//       		System.out.println("name or id matched");
//       		
//       	}
//       	else if(s.id==id1)
//       	{
//     		System.out.println("id matched");
//       		
//      	}
//       	else if(s.classname==classname1) {
//       		System.out.println("classname matched");
       	
//       	}
//      
//       }
     classsub c1=new classsub(1001,"java");
     classsub c2=new classsub(1002,"mca");
     classsub c3=new classsub(1003,"mca");
     classsub c4=new classsub(1004,"mba");
     classsub c5=new classsub(1005,"mba");
     classsub c6=new classsub(1006,"mba");
     classsub c7=new classsub(1007,"mba");
     classsub c8=new classsub(1008,"bca");
     classsub c9=new classsub(1009,"bca");
     classsub c10=new classsub(1010,"bca");
     
     List<String> subList = new ArrayList<String>();
     subList.add("mca");
     subList.add("Java");
     c1.setSubjectname(subList);
     
     subList = new ArrayList<String>();
     subList.add("c++");
     subList.add("javascript");
     c2.setSubjectname(subList);
     subList = new ArrayList<String>();
     subList.add("python");
     subList.add("anjular");
     c3.setSubjectname(subList);
     subList = new ArrayList<String>();
     subList.add("business studies");
     subList.add("accounts");
     c4.setSubjectname(subList);
     subList = new ArrayList<String>();
     subList.add("statistics");
     subList.add("business analysis");
     c5.setSubjectname(subList);
     subList = new ArrayList<String>();
     subList.add("economics");
     subList.add("history");
     c6.setSubjectname(subList);
     subList = new ArrayList<String>();
     subList.add("english");
     subList.add("ca");
     c7.setSubjectname(subList);
     subList = new ArrayList<String>();
     subList.add("bs");
     subList.add("operation research");
     c8.setSubjectname(subList);
     subList = new ArrayList<String>();
     subList.add("html");
     subList.add("css");
     c9.setSubjectname(subList);
     subList = new ArrayList<String>();
     subList.add("bootstrap");
     subList.add("react js");
     c10.setSubjectname(subList);
     
     
     
     ArrayList<classsub>lista=new ArrayList<classsub>();
     {
    	 lista.add(c1);
    	 lista.add(c2);
    	 lista.add(c3);
    	 lista.add(c4);
    	 lista.add(c5);
    	 lista.add(c6);
    	 lista.add(c7);
    	 lista.add(c8);
    	 lista.add(c9);
    	 lista.add(c10);
    	 
     }
     
     
     
     for(classsub c:lista)
     {
    	 System.out.println("subjectID="+c.subid+"\t"+"subjectname="+c.subjectname+"\t"+"classname="+c.classnam);
    	 
     }
//     System.out.println("enter the class name");
//     String classnam1=sc.next();
     
     for(classsub c:lista)
     {
    	 if(c.classnam.equals(classname1))
    	 {
    		 
    		 System.out.println(c.subjectname);
    	 }
     }
     
     
     
       
	}

}
