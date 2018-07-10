/*(Merge two sorted lists) Write the following method that merges two sorted lists
into a new sorted list.
public static int[] merge(int[] list1, int[] list2)
Implement the method in a way that takes at most list1.length + list2.
length comparisons. Write a test program that prompts the user to enter two
sorted lists and displays the merged list. Here is a sample run. Note that the first
number in the input indicates the number of the elements in the list. This number
is not part of the list.*/
import java.util.* ; 
public class ex_7_31{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in) ; 
       System.out.print("Enter list1 : ") ; 
       int[] list1 = new int[input.nextInt()] ; 
       for(int i = 0 ; i < list1.length ; i++ ){
           list1[i] = input.nextInt() ; 
       }
       System.out.print("Enter list2 : ") ; 
       int[] list2 = new int[input.nextInt()] ; 
       for(int i = 0 ; i < list2.length ; i++ ){
          list2[i] = input.nextInt() ; 
       }
       int[] list3 = merge(list1 , list2 ) ; 
       sort(list3) ; 
   }
   public static int[] merge(int[] list1 , int[] list2){
       int[] list3 = new int[list1.length + list2.length ] ; 
       int j = 0 ; 
       for(int i = 0 ;i < list3.length ; i++ ){
           if( i < list1.length ){
	      list3[i] = list1[i] ; 
	   }else{
	      list3[i] = list2[j] ;
	      j++ ;  
	   }
       }
       return list3; 
   }
   public static void sort(int[] arr){
	  int temp = 0 ;
	// System.out.print(arr.length+ "\n") ;   
	  for(int i = 0 ; i <arr.length ; i++ ){
	    for(int a = 0 ; a < arr.length-1 ; a++ ){
	       if(arr[a] >  arr[a+1] ){
	          temp = arr[a] ; 
		  arr[a] = arr[a+1] ; 
		  arr[a+1] = temp ; 
	       }
	    }
	  }
	  System.out.print("The merged list is ") ; 
	  for(int n:arr){
	     System.out.print(n+ " ") ; 
	  } 
   }
}
