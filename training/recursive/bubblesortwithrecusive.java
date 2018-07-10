import java.util.* ; 
public class bubblesortwithrecusive{
	static Scanner input = new Scanner(System.in) ; 
    public static void main(String[] args){
	System.out.print("Enter numbers to sort :" ) ; 
	int[] A = new int[input.nextInt()] ; 
	readData(A,0) ; 
	printData(A,0) ;
        sort(A,0,0) ;
        System.out.println() ; 	
        printData(A,0) ; 	
    }
    public static void readData(int[] A , int i) {
        if( i < A.length ){
	   A[i] = input.nextInt() ; 
	   readData(A,i+1) ; 
	}
    }
    public static void printData(int[] A,int i ){
        if( i < A.length){
	   System.out.print(A[i] + " " ); 
           printData(A,i+1) ; 
	}
    }
    public static void sort(int[] A , int i , int j){
        if( i < A.length ){
	    if( j < A.length-1 ){
	       if( A[j] > A[j+1] ){
	           int temp = A[j] ; 
		   A[j] = A[j+1] ; 
		   A[j+1] = temp ; 
	       }
               sort(A,i,j+1) ; 
	    }
	    sort(A,i+1,0) ; 
	}
    }
}
