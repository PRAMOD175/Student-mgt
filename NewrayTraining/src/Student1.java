
public class Student1 {
	 String name;
     Student1()
     {
    	 
     } 
     
     Student1(String name){
    	if(null!=name)
    	{
    		
    	this.name=name;
    	 System.out.println(name);
    	 }
     }
     void print(String name)
     {
    	 if(null!=this.name && this.name.equals(name))
    	 { 
    		 if(null==this.name)
    		 {
    			 
    		 }
    		 if(null!=name && !name.equals(""))
    		 {
    			 System.out.println(name);
    		 }
    
    	 
     }
     }

}
