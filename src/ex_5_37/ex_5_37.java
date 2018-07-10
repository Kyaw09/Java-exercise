package ex_5_37;
import java.util.*; 
public class ex_5_37 {
             private  int  Dec_num ;
             private  Scanner input ; 
             private char i ; 
             private String str  = " ";
             public ex_5_37() {
            	     this.Dec_num  = 0  ; 
             }
             public void cal_Data() {
            	 System.out.println(" Enter decimal number     : ");
            	  input = new   Scanner(System.in) ; 
                   Dec_num = input.nextInt() ; 
                   while(Dec_num != 0 ) {
                	      this. i = (char) ((char)( Dec_num % 2) + '0') ;
                	       str += i ; 
                	       Dec_num /= 2 ; 
                   }
                   StringBuilder  s = new StringBuilder(str); 
                   System.out.println("The binary number is     " + s.reverse());
             }
}
