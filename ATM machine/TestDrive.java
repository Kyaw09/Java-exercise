public class TestDrive{
      public static void cal_Data() {
           Account a = new Account(1122,20000) ; 
	   a.setAnnualInterestRate(4.5) ; 
	   a.withdraw(2500) ; 
	   a.deposite(3000) ; 
	   System.out.println("Balance is " + a.getBalance() + " " + "Monthly Interest is "+ a.getMonthlyInterest()+" "+ "Date is "+ a.getDate() ) ; 
      }
}
