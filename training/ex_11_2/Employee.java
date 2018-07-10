public class Employee extends Person{
     public String office ; 
     public double salary ; 
     public MyDate date_hired ; 
     public Employee(){
       super() ; 
     }
     public Employee(String name , String address , String phone_number , String email_address , String office ,double salary , MyDate date_hired ) {
         super(name,address,phone_number,email_address);
	 this.office = office ;
	 this.salary = salary ; 
	 this.date_hired = date_hired ; 
     }
     public String toString(){
         return super.toString() + "\noffice is :"+this.office+"\nsalary is $"+this.salary+"\nDate is "+this.date_hired ; 
     }
}
