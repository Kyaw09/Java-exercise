import java.util.* ; 
import java.lang.* ; 
public class ex_12_7 {
   public static void main(String[] args){
	   Scanner input = new Scanner(System.in) ; 
       boolean b = true ; 
       do{
	    try{
		   System.out.println( "Enter binary string " ) ; 
                   System.out.println( "The decimal number is : " + bin2Dec(input.nextLine() ) ) ; 
	           b = false ; 
	    }catch(NumberFormatException e){
	        System.out.println( "You must enter binary number 1 or 0" ) ; 	
	    }
       }while(b) ; 
   }
   public static int bin2Dec(String s) throws  NumberFormatException{
      // String dec = "" ; 
       for(int i = 0 ; i < s.length() ; i++ ){
              if(!(s.charAt(i) == '0') && !(s.charAt(i) == '1' ))
		      throw new NumberFormatException() ;
       }
       return Integer.parseInt(s,2) ;
   }
}
