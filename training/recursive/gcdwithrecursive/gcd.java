import java.util.* ; 
public class gcd{
    static int[] arr ; 
    static Scanner input = new Scanner(System.in) ; 
    public static void main(String[] args){
      System.out.print("Enter number of data to find gcd " ) ; 
      int n = input.nextInt() ; 
      arr = new int[n] ; 
      System.out.print("Enter numbers to find gcd " ) ;
      for(int i = 0 ; i < arr.length ; i++ ){
         arr[i] = input.nextInt() ; 
      }
     // System.out.println(" The min is " + min(arr,arr[0] , 0 ) ) ;
      System.out.println(" The gcd is " + gcd(arr));   
    }
    public static int min(int[] a,int minn,int i){ 
	    if( i < a.length){
	       if( a[i] < minn){
	          minn = a[i];
	       }
	      return min(a,minn,i+1) ; 
	    }
	    return minn ; 
     }
    public static int gcd(int[] a){
	    int count  = 0 ;
	    int gcd = 0 ;  
	    int m = min(a,a[0],0) ;  
	    for(int i = 2 ; i <= m ; i++){
		for(int j = 0 ; j < a.length ; j++){
		    if( a[j] % i == 0){
		       count++ ; 
		    }
		    if( count == a.length){
		       gcd = i ;  
		    }
		    if( j == a.length-1 ){
		       count = 0 ; 
		    }
		}
	    } 
       return gcd ; 
    }
}
