import java.util.*;
public class Account{
	private String name ; 
    private int id ; 
    private double balance ; 
    private double  annualInterestRate ; 
    private java.util.Date dateCreated;
    ArrayList<Transaction> transaction ;  
    public Account() {
        this.id = 0 ; 
       this.balance = 0.0 ; 
       this.annualInterestRate = 0.0 ;        
	this.dateCreated = new java.util.Date() ;
       	this.transaction = new ArrayList<Transaction>() ;
    }
    public Account(int id , double balance) {
        this.id = id ; 
	this.balance = balance ;
        this.dateCreated = new java.util.Date() ;
        this.transaction = new ArrayList<Transaction>() ; 
    }
    public Account(String name,int id,double balance){
        this.name = name ; 
	this.id = id ; 
	this.balance = balance; 
	this.dateCreated = new java.util.Date() ;
        this.transaction = new ArrayList<Transaction>() ; 
    }
    public void setName(String name){
      this.name = name ; 
    }
    public String getName(){
       return this.name ; 
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
        return (annualInterestRate / 12) ; 
    }  
    public double getMonthlyInterest() {
        return balance *(getMonthlyInterestRate()/100); 
    }
    public void withdraw(double amount ) {
        this.balance -= amount ; 
	transaction.add(new Transaction('W',amount,balance,"Withdraw from account")) ; 
    }
    public void deposite(double amount ) {
        this.balance += amount ;
        transaction.add(new Transaction('D',amount,balance,"Deposite to account ")) ; 	
    }
    public java.util.Date getDate() {
        return this.dateCreated ; 
    }
    public ArrayList<Transaction> getTransaction(){
       return transaction ; 
    }
  }
