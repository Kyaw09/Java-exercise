package ex_5_28;

import java.util.* ; 
public class ex_5_28 {
      private  int year ; 
	private  int day ; 
       private  int result ; 
      private  String re ;
	private Scanner input; 
      public void cal_Data(){
            input = new Scanner( System.in ); 
       boolean b = true ; 
	do{
 try{
       System.out.println( " Enter year and first day of the year ( 2 for Tuesday ) " ) ; 
       year = input.nextInt() ; 
       day = input.nextInt() ;
      b = false ; 
    }catch(Exception ex) {
     System.out.println( " You must enter integer value ") ; 
     input.nextLine() ; 
} 
}while(b) ; 
   for( int i =1 ; i <= 12 ; i++){
    switch(i) {
    case 1 : System.out.print("JAN "+"1"+","+year+"is"+Day(month(i))+"\n");break ; 
    case 2 :  System.out.print("FEB "+"1"+","+year+"is"+Day(month(i))+"\n");break ; 
    case 3: System.out.print("MAR "+"1"+","+year+"is"+Day(month(i))+"\n");break ; 
    case 4: System.out.print("APR "+"1"+","+year+"is"+Day(month(i))+"\n");break ; 
    case 5:  System.out.print("MAY "+"1"+","+year+"is"+Day(month(i))+"\n");break ; 
    case 6:   System.out.print("JUN "+"1"+","+year+"is"+Day(month(i))+"\n");break ; 
    case 7:  System.out.print("JUL "+"1"+","+year+"is"+Day(month(i))+"\n");break ;   
    case 8:  System.out.print("AUG "+"1"+","+year+"is"+Day(month(i))+"\n");break ;  
    case 9:   System.out.print("SEP "+"1"+","+year+"is"+Day(month(i))+"\n");break ;  
    case 10:  System.out.print("OUT "+"1"+","+year+"is"+Day(month(i))+"\n");break ;  
    case 11:  System.out.print("NOV "+"1"+","+year+"is"+Day(month(i))+"\n");break ;  
    case 12:  System.out.print("DEC "+"1"+","+year+"is"+Day(month(i))+"\n");break ;   
}
}
}
public  int month(int i ) {
    switch(i) {
    case 1 :  result =  day ;break ; 
    case 2 : if(year%400==0)
                   result= (29%7)+day ; 
             else
                   result= (28%7)+day ;
             break ;  
    case 3:  result=  (31%7)+month(i-1);break ;
    case 4:  result=  (30%7)+month(i-1);break ;
    case 5:  result= (31%7)+month(i-1);break ;
    case 6:  result= (30%7)+month(i-1);break ;
    case 7:  result= (31%7)+month(i-1);break ; 
    case 8:  result= (31%7)+month(i-1);break ; 
    case 9:  result= (30%7)+month(i-1); break ; 
    case 10:  result= (30 %7 ) + month(i-1) ;break ; 
    case 11: result= (31 %7 ) + month(i-1) ;  break ; 
    case 12: result= (31 %7 ) + month(i-1) ; break ; 
}
 if( result > 7) {
      result %= 7 ;
      return result ;  
}
else 
  return result ;  
}
public  String  Day( int d) {
    switch(d) {
   case 1 :  re = " Monday "; break ; 
   case 2 :  re =  " Tuesday "; break ; 
   case 3 :  re = " Wed "; break ; 
   case 4 :  re =" Thu "; break ; 
   case 5 :  re =" Fri "; break ; 
   case 6 :  re =" Sat ";break ; 
   case 7 :  re =" Sun "; break ; 
}
return re ;  
}
}