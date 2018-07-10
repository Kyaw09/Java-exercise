import java.util.* ; 
public class ex_7_5{ 
	static Scanner input = new Scanner(System.in) ; 
	int[] a = new int[10] ; 
	public void  cal_Data(){
	   System.out.print("Enter ten numbers : ") ; 
	   for(int i= 0 ; i < a.length ; i++ ){
	       a[i] = input.nextInt() ; 
	   }
	   for(int i = 0 ; i < a.length ; i++ ){
	       for(int j = 0 ; j < a.length ; j++ ){
	          if(a[i] != 0 && a[j] != 0 ){
		   if(a[i] == a[j]){
		     if(i != j)
		       a[j] = 0 ; 
		   }
		  }
	       }
	   }
	   int[] arr = new int[10] ; 
	   int j= 0 ; 
	   for( int i = 0 ; i < a.length ; i++ ){
	      if( a[i] > 0){
	          arr[j] = a[i] ; 
		  j++ ; 
	      }
	   }
	   System.out.println("The number of distinct number is "+j) ;
	   System.out.print("The distinct numbers are : ") ; 
	   for(int i = 0 ; i < j ; i++ ){
	     System.out.print(arr[i]+" ") ; 
	   }
	}
	public static void main(String[] args){
	   ex_7_5 ex = new ex_7_5() ; 
	   ex.cal_Data() ; 
	}
}
