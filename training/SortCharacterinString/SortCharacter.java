import java.util.* ; 
public class SortCharacter{
   static String str ; 
   static Scanner input = new Scanner(System.in) ; 
   public static void main(String[] args){
      System.out.print("Enter string to sort character : " ) ; 
      str = input.nextLine() ; 
      int[] s = new int[str.length()]; 
      for(int i = 0 ; i < str.length() ; i++){
          s[i] = str.charAt(i) ;  
      }
      for(int i = 0 ; i< s.length ; i++){
          for(int j = 0 ; j < s.length-1 ; j++ ){
	     if( s[j] >  s[j+1] ){
	         int temp = s[j] ; 
		 s[j] = s[j+1] ; 
		 s[j+1] = temp ; 
	     }
	  }
      }
      String st = "" ; 
      System.out.print("The sorted string is " ) ; 
      for(int i= 0 ; i < s.length ; i++ ){
             st += (char)s[i] + "" ; 
      }
      System.out.print(st) ;  
   }
}
