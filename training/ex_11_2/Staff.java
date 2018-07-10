public class Staff extends Employee{
    public String title ; 
    public Staff(){
      super() ; 
    }
    public Staff(String name,String address,String phone_number,String email_address,String office,double salary,MyDate date_hired,String title){
         super(name,address,phone_number,email_address,office,salary,date_hired) ; 
	 this.title = title ; 
    }
    public String toString(){
       return super.toString() + "\ntitle is :"+ this.title  ; 
    }
}
