public class Account{
    private int id ; 
    private double balance ; 
    private double  annualInterestRate ; 
    private java.util.Date dateCreated; 
    public Account() {
        this.id = 0 ; 
       this.balance = 0.0 ; 
       this.annualInterestRate = 0.0 ;        
	this.dateCreated = new java.util.Date() ; 
    }
    public Account(int id , double balance) {
        this.id = id ; 
	this.balance = balance ;
        this.dateCreated = new java.util.Date() ; 	
    }
    public void setId(int id) {
        this.id = id ; 
    }
    public void setBalance(double balance){
        this.balance = balance ; 
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate ; 
    }
    public int getId() {
       return this.id ; 
    }
    public double getBalance() {
       return this.balance ; 
    }
    public double getAnnualInterestRate() {
       return this.annualInterestRate ; 
    }
    public void setDate(java.util.Date dateCreated){
        this.dateCreated =  dateCreated ; 
    }
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12)/100 ; 
    }  
    public double getMonthlyInterest() {
        return balance *getMonthlyInterestRate() ; 
    }
    public void withdraw(double balance ) {
        this.balance -= balance ; 
    }
    public void deposite(double balance ) {
        this.balance += balance ; 
    }
    public java.util.Date getDate() {
        return this.dateCreated ; 
    }
}
