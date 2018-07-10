public class TestDrive{
    public static void main(String[] args){
          Account a = new Account("Kyaw Kyaw ",1,5000) ; 
	  a.setAnnualInterestRate(1.2) ; 
	  a.deposite(30) ; 
	  a.deposite(40) ; 
	  a.deposite(50) ; 
	  a.withdraw(5) ; 
	  a.withdraw(4) ; 
	  a.withdraw(2) ; 
	  System.out.print("Account holder name is " + a.getName() + "\n interest rate is "+ a.getAnnualInterestRate() + "\n balance is " + a.getBalance() ) ; 
	  System.out.print("\n"+ "All transaction" ) ; 
	  for(int i = 0 ; i < a.getTransaction().size() ; i++){
	  System.out.print("\n"+ (a.getTransaction()).get(i).toString()) ; 
	  }
    }
}
