package palindrome;
import java.util.*;
public class palindrome{
	private Scanner input;

	public void cat_Data(){
	   int b= 0;
	   int num ;
	   int c = 0 ;  
       input = new Scanner (System.in);
       boolean boo = true ; 
       do{
       try{
       System.out.print("Enter the number  :");
       int a = input.nextInt();
      //System.out.print("Enter the number of digit :");
      //int d = input.nextInt();
      int d =  0  ; 
      int n = a ; 
      int z = a; 
      while( a != 0 ) {
         a /= 10 ; 
	 d++; 
      }
      switch(d){
       	  case 2 : b = 10 ; break;
       	  case 3 : b = 100 ; break;
       	  case 4 : b = 1000; break; 
       	  case 5 : b = 10000; break;
       	  case 6 : b = 100000; break;
       	  case 7 : b = 1000000; break;
       	  case 8 : b = 10000000; break;
       	  case 9 : b = 100000000; break;
          case 10 : b = 1000000000; break ; 
       }
       while( n != 0){
       	   num = n % 10 ; 
       	    c += (num * b);
       	   n = n /10 ;
           b /= 10 ;
       }
       System.out.println("The reverse is " + c);
       System.out.println( " The number is " + z ) ; 
       if( z != c ){
             System.out.println("NO");
       }
       else{
       	 System.out.println("Yes");
       }
       boo = false ; 
       }catch(Exception ex) {
          System.out.println( " You must enter integer value -2147483648 to 2147483648 " ) ; 
	  input.nextLine() ; 
       }
       }while(boo) ; 
      	}
}
