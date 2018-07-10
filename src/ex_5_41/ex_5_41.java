/*(Occurrence of max numbers) Write a program that reads integers, finds the larg-
est of them, and counts its occurrences. Assume that the input ends with number
0 . Suppose that you entered 3 5 2 5 5 5 0 ; the program finds that the largest
is 5 and the occurrence count for 5 is 4 .
(Hint: Maintain two variables, max and count . max stores the current max num-
ber, and count stores its occurrences. Initially, assign the first number to max
and 1 to count . Compare each subsequent number with max . If the number is
greater than max , assign it to max and reset count to 1 . If the number is equal to
max , increment count by 1 .)*/
package ex_5_41;
import java.util.*;
public class ex_5_41 {
	   private int number ;
	    Scanner input  = new Scanner(System.in) ;  
       public void cal_Data() {
    	          int orc = 0 , largest = 0 ; 
    	          do {
    	        	       number = input.nextInt(); 
    	        	       if( number > largest) {
    	        	    	      orc = 0 ; 
    	        	    	      largest = number ; 
    	        	       }
    	        	       if( number == largest) {
    	        	    	     orc++ ; 
    	        	       }
    	          }while(number != 0);
    	          System.out.println(" The Largest number is "+ largest + "it's occurrence is "+ orc );
       }
       public  static  void main(String[] args) {
		   ex_5_41 e = new ex_5_41(); 
		   e.cal_Data();
	}
}
