package ex_5_5;
/*5.5 (Conversion from kilograms to pounds and pounds to kilograms) Write a program
that displays the following two tables side by side:*/
public class ex_5_5 {
     public void cal_Data() {
	    double result_1 = 0.0,result_2 =0.0;
	    System.out.printf("%-12s%12s%10s" , "Kilogram" , "Pounds" , "|") ;
            System.out.printf("    "+"%-12s%12s\n" , "Pounds" , "Kilogram" ) ; 
	   System.out.printf("%-12d%12.2f%10s" , 1 , 2.2f , "|" ); 
            System.out.printf("    "+"%-12d%12.2f\n",20,9.09f) ; 

          for( int i=3,j= 25; i+j < 715 ;j +=5,i += 2 ) { 
               result_1= (double) i* 2.2 ; 
               result_2 = (double) j/20 * 9.09 ; 
	       System.out.printf("%-12d%12.2f%10s" , i , result_1 , "|") ;
               System.out.printf("    "+"%-12d%12.2f\n",j,result_2 ) ;      
	  }
}
     public static void main ( String[] args) {
          ex_5_5 e_5_5 = new ex_5_5() ; 
	  e_5_5.cal_Data() ; 
     }
 }

