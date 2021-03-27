import java.util.List;

public class Studentarr {
	public int id;
	public String name;
	public String classname;
	public String fathername;
	  Studentarr(int id,String name,String classname,String fathername)
	  {
		  this.id=id;
		  this.name=name;
		  this.classname=classname;
		  this.fathername=fathername;	  
	  }
	  
	   

}
 class classsub{
	 public int subid;
	 public List<String> subjectname;
	 public String classnam;
//	 classsub(int subid,List<String> subjectname,String classnam)
//	 {
//		 this.subid=subid;
//		 this.subjectname=subjectname;
//		 this.classnam=classnam;
//		 
//	 }
//	 
	 classsub(int subid,String classnam)
	 {
//		 this.subid=subid;
//		 this.classnam=classnam;
		 
	 }
	 
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public List<String> getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(List<String> subjectname) {
		this.subjectname = subjectname;
	}
	public String getClassnam() {
		return classnam;
	}
	public void setClassnam(String classnam) {
		this.classnam = classnam;
	}
	 
	 
	
}

