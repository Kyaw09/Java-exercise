package ex_5_1;
/*5.1 (Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0 . Display
the average as a floating-point number. Here is a sample run:*/
import java.util.*; 
public class ex_5_1 {
  private static int num  ; 
  private int[] n ;
private Scanner input; 
   public void cal_Data() {
        input = new Scanner(System.in);  
        int i = 0 ;
	boolean b =true ; 
	do{
	try{
        System.out.print( " Enter number of integer   : " ) ; 
      	num = input.nextInt() ;
	n = new int[num] ; 
        System.out.print( " Enter integer values    : " ) ; 
        n[i] = input.nextInt() ; 	
	while( n[i] != 0) {
		i++; 
             n[i] = input.nextInt();	     
	}	
	int countn = 0 , countp = 0;
	double sum=0.0 ;  
	for(i = 0 ; i < n.length-1 ; i++) {
	     if( n[i] < 0 )
		  countn++ ; 
	     else if(n[i] > 0)
                  countp++ ; 
	     sum += n[i] ; 
        }
	double average = sum / (countn+countp); 
		System.out.println( "The number of positive is   :"+ countp ) ; 
	        System.out.println( "The number of negative is   :"+ countn ) ; 
	        System.out.println( "The total is                :"+ sum ) ; 
	    	System.out.println( "The average is              :"+ average) ;
	       b = false ; 	
	}catch(Exception ex){
	    System.out.println( " You must  enter integer value " ) ;
	   input.nextLine() ; 
	}
	}while (b) ; 	
       }
   public static void main(String[] args){
        ex_5_1 e_5_1 = new ex_5_1() ; 
	e_5_1.cal_Data() ; 
   }   
   }

