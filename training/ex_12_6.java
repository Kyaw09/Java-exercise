import java.util.* ; 
import java.lang.* ; 
public class ex_12_6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ; 
        boolean b = true ;  
	do{
	System.out.print("Enter hex string  : " ) ; 
        try{
	    System.out.println( " The hex number is " + hex2Dec((input.nextLine())) ) ; 
	    b = false ; 
	}catch(NumberFormatException e){
	    System.out.println( " You must enter hex string 0 to 9 or A to F " ) ; 
	    System.out.println( " Try again " ) ; 
		    input.nextLine() ;
	}
	}while(b) ; 
    }
    public static int hex2Dec(String s) {
       // int hexint = 0 ; 
       for( int i = 0 ; i < s.length() ; i++ ){
  	       if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')&& !(s.charAt(i) >= 'A' && s.charAt(i) <= 'F' ))
	       throw new NumberFormatException() ; 
            // char hex = s.charAt(i) ; 
	  //   hexint = hexint * 16 + convertDec(hex) ; 
       }
       return Integer.parseInt(s,16) ; 
      // return hexint ; 
    }
   /* public static int convertDec(char hex ) {
       if( hex >= 'A' && hex <= 'F' )
         return  hex - 'A' + 10 ; 
       else 
	  return hex - '0' ; 
    }*/
}
