import java.util.* ; 
public class ex_18_5{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in) ; 
       System.out.print("Enter number " ) ; 
       int n = input.nextInt() ; 
       System.out.println( " The series is " + m(n,1,0,3)) ; 
   }
   public static double m(int n,int i,double r,int a){
       if(i <= n ){
	       r +=(double) i / a ; 
        return  m(n,i+1,r,2*i+1) ; 
       }
       return r ; 
   }
}
