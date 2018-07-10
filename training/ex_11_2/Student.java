public class Student extends Person{
     private int status ; 
     public static final int freshman = 1 ; 
     public static final int sophomore = 2 ; 
     public static final int junior = 3 ; 
     public static final int senior = 4 ; 
     public Student(){
        super() ; 
     }
     public Student(String name , String address , String phone_number , String email_address , int status){
         super(name,address,phone_number,email_address ) ; 
	 this.status = status ; 
     }
     public void setStatus(int status){
        this.status = status ; 
     }
     public String getStatus(){
       switch(status){
          case 1 : return "fresheman" ;
          case 2 : return "sophomore" ; 
	  case 3 : return "junior" ; 
	  case 4 : return "senior" ; 
          default : return "unknown" ; 
       } 
     }
     public String toString() {
       return super.toString() + "\nStatus is :" + getStatus() ; 
     }
}
