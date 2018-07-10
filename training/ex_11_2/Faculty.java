public class Faculty extends Employee{
     public String office_hour ; 
     public String rank ; 
     public Faculty(){
       super() ; 
     }
     public Faculty(String name,String address,String phone_number,String email_address,String office ,double salary , MyDate date_hired , String office_hour , String rank){
       super(name,address,phone_number,email_address,office,salary,date_hired) ; 
       this.office_hour = office_hour ; 
       this.rank = rank ; 
     }
     public String toString(){
       return super.toString() + "\noffice hours is "+this.office_hour+"\nrank is"+this.rank  ;  
     }
}
