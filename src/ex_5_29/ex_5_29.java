package ex_5_29;

import java.util.* ; 
public class ex_5_29 {
    private int year ; 
    private int start_Day ; 
    private int numOfDay ;
	private Scanner input; 
    public void cal_Data() {
      input = new Scanner(System.in); 
        boolean b = true ; 
        do{
        try {
            System.out.println( " Enter year and first Day of the year (i.e 2 for TUE )    : " ) ; 
            year = input.nextInt() ; 
            start_Day = input.nextInt() ;
            b = false ; 
        }catch( Exception ex) {
             System.out.println( " Useage : You must enter integer value " ) ; 
             input.nextLine() ; 
        }
        }while(b) ; 
           for( int i = 1 ; i <= 12 ; i++) {
               numOfDayInMonth(i) ; 
               System.out.println( "-------------------------------" ) ; 
               System.out.println( " SUN MON TUE WED THU FRI SAT") ; 
               for( int j = 0 ; j < start_Day ; j++){
                   System.out.print("    ") ; 
               }
               for( int z = 1 ; z <= numOfDay ; z++){
                    if( z < 10) {
                       System.out.print("   "+z) ; 
                    }
                    else{
                       System.out.print("  "+z) ; 
                    }
                    if( (z+start_Day) % 7 == 0 ) {
                       System.out.println() ; 
                    }
               }
               System.out.println(" ") ; 
               start_Day = ( start_Day + numOfDay ) % 7 ; 
           }
    }
    public void numOfDayInMonth(int i) {
        switch(i) {
           case 1 : System.out.println( "      JAN " + year ); 
                    numOfDay = 31 ; break ;
           case 2 : System.out.println( "      FEB " + year ); 
                    if(year % 400 == 0 ) 
                         numOfDay = 29 ; 
                    else 
                         numOfDay = 28 ;
                    break ; 
           case 3 : System.out.println( "      MAR " + year ); 
                    numOfDay = 31 ; break ; 
           case 4 : System.out.println( "      APR " + year ); 
                    numOfDay = 30 ; break ; 
           case 5 : System.out.println( "      MAY " + year ); 
                    numOfDay = 31 ; break ; 
           case 6 : System.out.println( "      JUN " + year ); 
                    numOfDay = 30 ; break ; 
           case 7 : System.out.println( "      JUL " + year ); 
                    numOfDay = 31 ; break ; 
           case 8 : System.out.println( "      AUG " + year ); 
                    numOfDay = 31 ; break ; 
           case 9 : System.out.println( "      SEP " + year ); 
                    numOfDay = 30 ; break ; 
           case 10 : System.out.println( "      OUT " + year ); 
                    numOfDay = 31 ; break ; 
           case 11 : System.out.println( "      NOV " + year ); 
                    numOfDay = 30 ; break ; 
           case 12 : System.out.println( "      DEC " + year ); 
                    numOfDay = 31 ; break ; 

        }
    }
}
