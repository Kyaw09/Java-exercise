package ex_5_9;
import java.util.*; 
public class ex_5_9 {
   private String str ; 
   private double score ;
   private int n ;
private Scanner input;  
   public void cal_Data() {
   input = new Scanner(System.in); 
    double Large, Sec_Large , s ;
     String Lar_st,st , sec_st ;
boolean b = true ;
do{  
     try{
      System.out.print( " Enter number of student    : " ); 
      n = input.nextInt() ;
      b = false ; 
}catch( Exception ex) {
      System.out.println( " You must enter integer value " ) ; 
      input.nextLine() ; 
}
}while(b) ; 
     boolean bo = true ;
     int i = 2 ; 
do{ 
try {
     System.out.print( " Enter student name   : " ) ; 
     str = input.next() ;   
     System.out.print( " Enter score      : " ) ; 
     score = input.nextDouble() ;
     Lar_st = str ; 
     Large = score ; 
     System.out.print( " Enter student name   : " ) ; 
     str = input.next() ;  
     System.out.print( " Enter score      : " ) ; 
     score = input.nextDouble() ; 
     sec_st = str  ; 
     Sec_Large = score ; 
     if( Sec_Large > Large ) {
     String strr = Lar_st ; 
     Lar_st = sec_st ; 
     sec_st = strr ; 
     double temp = Sec_Large ;
     Sec_Large = Large ; 
     Large = temp ; 
}
   do{  
     System.out.print( " Enter student name   : " ) ; 
     str = input.next() ;     
     System.out.print( " Enter score      : " ) ; 
     score = input.nextDouble() ;
     st = str ; 
     s = score ;
     if( s > Large ) {
           sec_st = Lar_st ; 
           Sec_Large = Large ; 
           Large = s;
           Lar_st = st ; 
           
     }
     if( s < Large && s > Sec_Large ) {
           Sec_Large = s ; 
            sec_st = str ; 
     }
     i++ ; 
   }while( i < n) ; 
   System.out.println( " The name of student with highest score   : " + Lar_st + " and " + " his or her score is " + Large );
  System.out.println( " The name of student whih second highes score  : " + sec_st + " and " + " his or her score is " + Sec_Large ) ; 
bo = false ; 
}catch(Exception ex) {
     System.out.println( " You must enter integer value " ) ; 
     input.nextLine() ; 
}
}while(bo) ; 
}
public static void main(String[] args) {
   ex_5_9 e_5_9 = new ex_5_9() ; 
   e_5_9.cal_Data() ; 
}
}

