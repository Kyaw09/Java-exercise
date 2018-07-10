import java.util.* ; 
public class ex_8_26{
   public static void main(String[] args){
      System.out.println( "Enter a 3-by3 matrix row by row " ) ; 
      Scanner input = new Scanner(System.in) ; 
      double[][] A = new double[3][3] ; 
      for( int i = 0 ; i < A.length ; i++){
         for(int j = 0 ; j < A[i].length ; j++ ){
	     A[i][j] = input.nextDouble() ; 
	 }
      }
      for( int i = 0 ; i < sortRows(A).length  ; i++){
           for( int j = 0 ; j < sortRows(A)[i].length ; j++){
	      System.out.print(sortRows(A)[i][j] + " " ) ;  
	   }
	   System.out.println() ; 
      }
   }
   public static double[][] sortRows(double[][] m){
       for(int i = 0 ; i < m.length ; i++){
	 for(int a = 0 ; a < m[i].length ; a++){
          for(int j = 0 ; j < m[i].length-1 ; j++ ){
	       if(m[i][j] > m[i][j+1] ){
	          double temp = m[i][j] ; 
		  m[i][j] = m[i][j+1] ; 
		  m[i][j+1] = temp ; 
	       }
	  }
	 }
       }
       return m ; 
   }
}
