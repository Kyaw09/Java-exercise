import java.util.* ; 
public class gcd{
   static Scanner input = new Scanner(System.in) ; 
   public static void main(String[] args){
        System.out.println( " Enter two numbers : " ) ; 
        System.out.println(com_gcd(input.nextInt() , input.nextInt() )) ; 
   }
   public static int com_gcd(int x , int y ){
        if( x%y == 0 )
	   return y ; 
	else
           return com_gcd(y,x%y) ; 
   }
}
