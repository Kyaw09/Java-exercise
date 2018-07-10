import java.util.* ; 
public class ex_7_26_27{
	static Scanner input = new Scanner(System.in) ; 
        static int[] list1 ;
	static int[] list2 ; 
   public static void main(String[] args){
      System.out.print("Enter list1 : " ) ; 
      list1 = new int[input.nextInt()] ;  
      for(int i = 0 ; i < list1.length ; i++ ){
          list1[i] = input.nextInt() ; 
      }
      System.out.print("Enter list2 : ") ; 
      list2 = new int[input.nextInt()] ;
      for(int i = 0 ; i < list2.length ; i++ ){
          list2[i] = input.nextInt() ; 
      } 
      if(equals_strictly(list1,list2)){
         System.out.println("Two lists are strictly identical") ; 
      }else if(equals_normal(list1,list2)){
         System.out.println("Two lists are not strictly identical." ) ; 
	 System.out.print("But Two lists are identical " ) ; 
      }else{
         System.out.println("Two lists are not strictly identical and identical") ; 
      }
   }
   public static boolean equals_strictly(int[] L1, int[] L2) {
       int count = 0 ; 
	   if(L1.length == L2.length){
      for(int i = 0 ;  i < L1.length ; i++){
          if( L1[i] == L2[i] ){
	      count++ ; 
	  }
	  if( count == L1.length ){
	      return true ; 
	  }else{
	      if( i == L1.length-1 ) {
	        count = 0  ; 
	      }
	  }
      }
      }else{
         return false ; 
      }
      return false ; 
   }
   public static boolean equals_normal(int[] L1, int[] L2){
     int count = 0 ; 
     if(L1.length == L2.length ){
       for(int i = 0 ; i < L1.length ; i++){
         for(int j = 0 ; j < L1.length ; j++){
	   if( L1[i] == L2[j] ){
	      count++ ; 
	      break ; 
	   } 
	 }
       }
       if(count == L1.length){
           return true ; 
       }else{
           return false ; 
       }
     }
     return false ; 
   }
}
