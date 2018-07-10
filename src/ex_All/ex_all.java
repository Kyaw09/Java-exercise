package ex_All;
import java.util.* ; 
import ex_3_5.ex_3_5;
import ex_3_9.ex_3_9;
import ex_5_1.ex_5_1;
import ex_5_17.ex_5_17;
import ex_5_20.ex_5_20;
import ex_5_26.ex_5_26;
import ex_5_28.ex_5_28;
import ex_5_29.ex_5_29;
import ex_5_33.ex_5_33;
import ex_5_37.ex_5_37;
import ex_5_41.ex_5_41;
import ex_5_5.ex_5_5;
import ex_5_51.ex_5_51;
import ex_5_9.ex_5_9;
import ex_6_3.ex_6_3;
import ex_6_6.ex_6_6;
import palindrome.palindrome; 
public class ex_all {
   private static Scanner input;

public static void main(String[] args) {
           input = new Scanner( System.in); 
	  // String c ;
	  // char ch;
	   int ch=0 ;  
	   do{
            System.out.println("\n"+"-------------------------------------------" ) ; 
	    System.out.println(" \n " +"               Main Menu                   " ) ;
	    System.out.println( "-------------------------------------------" ) ;
	    System.out.println( "         ********Chapter 3*********       " ) ; 
	    System.out.println( " 1. Enter 1 to solve ex_3_5 or future day " ) ;
            System.out.println( " 2. Enter 2 to solve ex_3_9 or ISBN-10 " ) ;
            System.out.println( " 3. Enter 3 to solve ex_3_11 or palindrome " ) ;
            System.out.println( "         ********Chapter 5*********       " ) ; 
	    System.out.println( " 4. Enter 4 to solve ex_5_1 or Count positive and negative numbers and compute the average of number " ) ;
            System.out.println( " 5. Enter 5 to solve ex_5_5 or Drawing table " ) ;
            System.out.println( " 6. Enter 6 to solve ex_5_9 or Largest score of student without using arrays ") ;
            System.out.println( " 7. Enter 7 to solve ex5_17 or Display pyramid " ) ;
            System.out.println( " 8. Enter 8 to solve ex5_20 or Display prime number " ) ;
            System.out.println( " 9. Enter 9 to solve ex5_33 or Display perfect number < 10000 " ) ; 
            System.out.println( " 10. Enter 10 to solve ex5_28 or Display first of each month by entering year and first day of the year " ) ;
            System.out.println( " 11. Enter 11 to solve ex5_29 or Display calendar by entering year and first day of the year " ) ;
            System.out.println(" 12. Enter 12 to solve ex_5_37 or Converting Decimal number to Binary number ");
                                               // note you want to  convert Decimal number to Binary number use Integer.toBinaryString(integer) ; 
	        System.out.println(" 13. Enter 13 to solve ex_5_26 or Calculating e = 1 + 1/1! +1/2!+ ..........");
            System.out.println(" 14. Enter 14 to solve ex_5_41 or Calculating largest number and its occurrence ");
            System.out.println(" 15. Enter 15 to solve ex_5_51 or Finding common prefix ");
            System.out.println(" 16. Enter 16 to solve ex_6_3 or Finding palindrome using method ");
            System.out.println(" 17. Enter 17 to solve ex_6_6 or Display pattern ");
            System.out.println("18 . Enter 18 to execute ATM machine ");
	        System.out.println( " 0. Enter 0 to exit " ) ; 
	    System.out.println("************************************************"); 
          // c = input.nextLine() ;
	   // ch = c.charAt(0) ;
	   boolean bo = true ; 
	   do{ 
	   try{
           System.out.print( " Enter the number to solve programs    :  " ) ; 
	   ch  = input.nextInt() ;
           switch(ch) {
		    case 1  : boolean b = true ; 
			      while(b){
			      System.out.print( " Enter today :    " ) ; 
			      try{
			     int  d = input.nextInt() ; 
			      while( d >= 7){
			          System.out.println( " You must enter day less than 7 i.e 0,1,2.... < 7 " ) ;
				  System.out.print( " Enter today :     " ) ;
				  d = input.nextInt() ; 
			      }
			      System.out.print(" Enter futureDay :     ") ;                       
			      int e = input.nextInt() ;
                              ex_3_5  e_3 = new ex_3_5(d,e) ; 
	                      e_3.cal_Data();
			     b = false ; 
			      }catch( Exception ex) {
			        System.out.println( " You must enter  integer i.e 0,1,2..." ) ;
			        input.nextLine() ; 	
			     } 
			      }
			     break ;
		    case 2 : System.out.println( " Enter 9-digit number  ") ;  
			     int n = input.nextInt() ; 
			     ex_3_9 ex = new ex_3_9(n) ; 
			     ex.cal_Data() ; 
			     break ;
		    case 3 : palindrome p = new palindrome() ; 
			     p.cat_Data() ;
			     break; 
	      case 4 : ex_5_1 e_5_1 = new ex_5_1() ; 
			     e_5_1.cal_Data() ;
			     break ; 
        case 5 : ex_5_5 e_5_5 = new ex_5_5() ; 
			     e_5_5.cal_Data() ; break ; 
        case 6 : ex_5_9 e_5_9 = new ex_5_9() ; 
				e_5_9.cal_Data() ; break ;           
		    case 7 : ex_5_17 e_5_17 = new ex_5_17() ; 
				e_5_17.cal_Data() ; break ;
        case 8 : ex_5_20 e_5_20 = new ex_5_20() ; 
				e_5_20.cal_Data() ; break ; 
        case 9 : ex_5_33 e_5_33 = new ex_5_33();
                   e_5_33.cal_Data();break ;
        case 10 : ex_5_28 e_5_28 = new ex_5_28() ; 
                  e_5_28.cal_Data() ; break ; 
        case 11 : ex_5_29 e_5_29 = new ex_5_29();
                  e_5_29.cal_Data() ; break ; 
         case  12 : ex_5_37 e_5_37 = new ex_5_37() ; 
                            e_5_37.cal_Data();break ; 
         case 13 : ex_5_26 e_5_26 = new ex_5_26();
                          e_5_26.cal_Data();break ; 
         case 14 : ex_5_41 e_5_41 = new ex_5_41() ; 
                          e_5_41.cal_Data();break ; 
         case 15 : ex_5_51 e_5_51 = new ex_5_51() ; 
                          e_5_51.cal_Data();break ; 
         case 16 : ex_6_3 e_6_3 = new ex_6_3(); 
                          e_6_3.cal_Data(); break ; 
         case 17 : ex_6_6 e_6_6 = new ex_6_6(); 
                          e_6_6.cal_Data();
         case 18 : //TestDrive e = new TestDrive() ; 
                        // e.cal_Data() ; 
	    }
	    bo = false ; 
	   }catch(Exception ex) {
	     System.out.println( " You must enter integer value " ) ; 
	     input.nextLine() ; 
	   }
	   }while( bo ) ; 
	}while(ch != 0 ) ;
   }
 }

