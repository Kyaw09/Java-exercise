import java.util.* ; 
public class ex_18_11 {
   public static void main(String[] args){
       System.out.print(" Enter number :" ) ; 
       Scanner input = new Scanner(System.in) ; 
       System.out.print(" The sum of digit is " + sumDigits(input.nextLong()))  ; 
   }
   public static int sumDigits(long n){
       if( n == 0)
	       return (int) n ; 
       return  (int)(n % 10) + sumDigits(n/10) ; 
   }
}
