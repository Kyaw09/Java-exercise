import java.util.* ; 
public class TestDrive{
      public static void main(String[] args){
      Scanner input = new Scanner(System.in) ; 
      System.out.print("Enter the number of row and columns in the array : ") ; 
      int row = input.nextInt() ; 
      int column = input.nextInt() ; 
      double[][] a = new double[row][column] ; 
      System.out.println("Enter the array : ") ; 
      for(int i = 0 ; i < a.length ; i++ ){
        for(int j = 0 ; j < a[i].length ; j++){
	     a[i][j] = input.nextDouble() ; 
	}
     }  
     Location  v = Location.locateLargest(a) ; 
     System.out.println("The location of the largest elemant is "+v.maxValue+" at"+"("+v.row+","+v.column+")") ; 
   }

}
