import java.util.* ; 
public class reverse_recuchar{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in) ; 
       System.out.print( "Enter string  : ") ; 
       reverseDisplay(input.nextLine()); 
   }
   public static void reverseDisplay(String value){
     if(value.length() == 0)
	     return ; 
     System.out.print(value.charAt(value.length()-1) ) ; 
     reverseDisplay(value.substring(0,value.length()-1) ) ; 
   }
}
