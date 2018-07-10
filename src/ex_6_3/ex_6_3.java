package ex_6_3;
import java.util.* ; 
public class ex_6_3 {
     private  int  num ;
      Scanner input= new Scanner(System.in); 
     public ex_6_3() {
    	 this.num = 0 ; 
     }
     public ex_6_3(int  num ) {
    	 this.num = num ; 
     }
	public long getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void cal_Data() {
		System.out.println("Enter integer number < 2147483648 ");
		boolean bo= true ; 
		do {
		try {
			  num = input.nextInt();  
			  if(isPalindrome(num)) {
				  System.out.println(" This number is Palindrome ");
			  }else {
				  System.out.println(" This number is not Palindrome");
			  }
			  bo = false ; 
		}catch(Exception ex) {
			  System.out.println("You must enter integer value ");
			  input.nextLine() ; 
		}
		}while(bo); 		
	}
	public static int reverse(int num) {
		int dig=0 , reverse = 0;   
		int d = 0 , b = 0  ; 
		int n = num ; 
		while(n> 0 ) {
			     n /= 10 ; 
			     b++ ; 
		   }
		switch(b) {
		case 2 :  d = 10 ;break ;  
		case 3 : d = 100 ;break ; 
		case 4 :  d = 1000 ;break ;  
		case 5 : d = 10000 ;break ; 
		case 6 :  d = 100000 ;break ; 
		case 7 :  d = 1000000 ;break ; 
		case 8 : d = 10000000 ;break ; 
		case 9 : d = 100000000 ;break ; 
		case 10 : d = 1000000000 ;break ; 
		}
		while( num > 0 ) {
			   dig = num % 10 ; 
			   reverse +=(dig *d); 
			   num /= 10 ; 
			   d /= 10 ; 
		  }
		return reverse ; 
	}
	public static boolean  isPalindrome (int num) {
		   if(num == reverse(num)) {
			     return true ; 
		   }else {
			   return false ; 
		   }
	}
}
