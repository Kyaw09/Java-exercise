package ex_6_6;
import java.util.*;
public class ex_6_6 {
      public Scanner input = new Scanner(System.in); 
      private int num ;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	} 
	public void cal_Data() {
		  System.out.println(" Enter number     : ");
		   num = input.nextInt(); 
		   DisplayPattern(num);
	}
    public  void DisplayPattern(int n) {
    	   int i = 1 ; 
    	   while(i <= n) {
    		   for(int j = 0 ; j < n-i ; j++) {
    			   System.out.printf("%5s", "");
    		   }
    		   for(int a = i ; a > 0 ; a--) {
    			   System.out.printf("%4d" ,a);
    		   }
    		   System.out.println("");
    		   i++; 
    	   }
    }
}
