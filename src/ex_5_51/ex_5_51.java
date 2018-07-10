package ex_5_51;
import java.util.*; 
public class ex_5_51 {
	       Scanner input = new Scanner(System.in);
	       private String str , str1,result; 
	       public void cal_Data() {
	    	             System.out.println("Enter first string :");
        	              str = input.nextLine(); 
        	              System.out.println("Enter second string : ");
        	              str1 = input.nextLine();
        	              result = " ";
        	              int limit = ( str.length() < str1.length()) ? str.length() : str1.length(); 
        	              for( int i = 0 ; i < limit; i++) {
        	            	       if(str.charAt(i) == str.charAt(i)) {
        	            	    	     result += str.charAt(i); 
        	            	       }
        	              }
        	             if(result.length()>0){
        	            	  System.out.println(" The common prefix is " + result);
        	             }else
        	            	 System.out.println("Two Strings have no common prefix ");
           }
}
