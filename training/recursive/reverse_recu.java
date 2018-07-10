import java.util.* ; 
public class reverse_recu{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in) ; 
       System.out.print("Enter number  " ) ; 
       reverseDisplay(input.nextInt()) ; 
   }
   public static void reverseDisplay(int value) {
       if( value <= 0 )
	       return ; 
       System.out.print(value%10) ; 
       reverseDisplay(value/10) ; 
   }
}
