public class Person {
    public  String name ; 
    public  String address ; 
    public  String phone_number ; 
    public  String email_address ; 
    public Person(){
    
    }
    public Person(String name , String address , String phone_number , String email_address ) {
          this.name = name ; 
	  this.address = address ; 
	  this.phone_number = phone_number ; 
	  this.email_address = email_address ; 
    }
    public  String toString() {
        return   "Person\n" +"name is " + name + "\naddress is "+ address +"\nphone_number is " + phone_number + "\nemail_address is "+email_address ; 
    }
    
}
