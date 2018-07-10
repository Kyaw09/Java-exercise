import java.util.* ; 
import java.lang.* ; 
public class ex_12_3 {
    public static void main(String[] args){
        int[] arr = new int[100] ; 
	for(int i = 0 ; i < arr.length ; i++ ){
	   arr[i] = (int)(Math.random() * 100) ; 
	}
	Scanner input = new Scanner(System.in) ; 
	try{
          System.out.println(" Enter index to find values " ) ; 

	  int num = getArr(arr,input.nextInt()) ; 
	  System.out.println( " The value is " + num ) ; 
	}catch(ArrayIndexOutOfBoundsException ex) {
	   System.out.println( " You must enter index < array size " ) ; 
	}
    }
    public static int getArr(int[] a , int n){
        if( n > a.length )
                throw new  ArrayIndexOutOfBoundsException("") ; 
	return a[n] ; 
    }
}
