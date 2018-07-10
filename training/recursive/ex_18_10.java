import java.util.* ; 
public class ex_18_10{
    public static void main(String[] args){
        System.out.print("Enter string and character to find occurrences ") ; 
	Scanner input = new Scanner(System.in) ; 
	String str = input.next() ; 
	char a = (input.next()).charAt(0) ; 
	System.out.println( " The count is " + count(str,a) ) ; 
    }
    public static int count(String str,char a){
         int n = (a == str.charAt(0) ) ? 1 : 0 ; 
	 if( str.length()== 1 ){
	     return n ; 
	 }
	 else{
	     return n+count(str.substring(1),a) ; 
	 }
    }
}
