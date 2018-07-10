package ex_18_25;
import java.util.Scanner;
public class ex_18_25{
      private static String s;
      static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
    	System.out.print(" Enter  a string   : ");
	    s= input.next();
		System.out.println(" All possible permutation of  " + s  +" are ");
		displayPermutation("",s);		
      }
	//public static void displayPermutation(String s) {
		//displayPermutation("",s); 
	//}
   public static void displayPermutation(String s1 , String s2) {
	       if(s2.length()  == 0) {
	    	   System.out.println(s1);
	       }else {
	    	   for(int i = 0 ; i < s2.length() ; i++) {
	    		      displayPermutation( s1+s2.charAt(i), s2.substring(0,i)+s2.substring(1+i));
	    	   }
	       }
   }
public static String getS() {
	return s;
}
public static void setS(String s) {
	ex_18_25.s = s;
}
public static Scanner getInput() {
	return input;
}
public static void setInput(Scanner input) {
	ex_18_25.input = input;
}

}
