/*(The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row , column , and maxValue that store the maximal value and its indices
in a two-dimensional array with row and column as int types and maxValue as
a double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location . Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
eement in the array. Here is a sample run:*/
import java.util.*; 
public class Location{
   public int row ,column ; 
   public double maxValue ; 
   public Location(){
   }
   public Location(int row , int column){
        this.row = row ; 
	this.column = column ; 
   }
   public Location(int row,int column , double maxValue){
       this.row = row ; 
       this.column = column ; 
       this.maxValue = maxValue ; 
   }
   public static Location locateLargest(double[][] a){
       Location b = new Location() ; 
       b.maxValue = a[0][0] ; 
       for(int i = 0 ; i < a.length ; i++){
           for(int j=0 ; j< a[i].length ; j++ ){
	     if(a[i][j] > b.maxValue ){
	       b.maxValue = a[i][j] ;
	       b.row = i ; 
	       b.column  = j ; 
	     }
	   }
       }
       return new Location(b.row,b.column,b.maxValue) ; 
   }
}
