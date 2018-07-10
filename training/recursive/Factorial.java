import java.util.* ;
import java.math.* ; 
public class Factorial{
   static Scanner input = new Scanner(System.in) ; 
   public static void main(String[] args){
       System.out.println( " Enter number > 100 " ) ; 
       BigInteger b = new BigInteger(input.nextInt()+"") ; 
       System.out.println(factorial(b)) ; 
   }
   public static BigInteger factorial(BigInteger b){
       if(b.compareTo(BigInteger.ONE) == 0 )
           return BigInteger.ONE;
       else
	   return  b.multiply(factorial(b.subtract(BigInteger.ONE))) ; 
   }
}
