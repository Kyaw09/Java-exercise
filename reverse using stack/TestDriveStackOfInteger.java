import java.util.*; 
public class TestDriveStackOfInteger{
  private int num ;
  private String str ; 
  private static Scanner input = new Scanner(System.in) ; 
     public static void main(String[] args){
       TestDriveStackOfInteger T = new TestDriveStackOfInteger() ;
       System.out.println( " Enter number " ) ; 
       T.num = input.nextInt() ;
       T.str = T.num + "" ; 
       StackofInteger S =new StackofInteger() ;
       for(int i = 0 ; i < T.str.length() ; i++){
            S.push(Integer.parseInt(T.str.charAt(i)+"")) ; 
       }
       System.out.println( S.getSize() ) ; 
       System.out.print("\n" + " The reverse number is : " ) ; 
       for(int i = 0 ; i < T.str.length() ; i++){
            System.out.print(S.pop() ) ; 
       } 
     }
}
