package ex_5_17;

/*(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:*/
import java.util.*; 
public class ex_5_17 {
   private int n ;
private Scanner input; 
   public void cal_Data() {
      boolean b = true ; 
input = new Scanner(System.in);      
do{
  try{
     System.out.print( " Enter number of line       : ") ; 
     n = input.nextInt() ;
     b = false ; 
}catch(Exception ex) {
    System.out.println( " You must enter integer value  :" ) ;
    input.nextLine() ;  
} 
}while(b)  ;
for( int a = 1 ; a <= n ; a++){
System.out.print(" ") ; 
for( int i = 0 ; i < n-a ; i++ ) {
   System.out.println( " " ) ; 
}
for( int j = a ; j >0  ; j--){
   if( j < 10)
   System.out.print( j+"  " ) ;
   if( j >= 10 ) 
   System.out.println(j+" ") ;  
}
for( int z = 2 ; z <= a ; z++) {
    if( z < 10 ) 
    System.out.print(z+"  ") ;
    if( z >= 10) 
    System.out.println(z+" ") ;  
}
}
}
public static void main(String[] args) {
   ex_5_17 e_5_17 = new ex_5_17() ; 
   e_5_17.cal_Data() ; 
}
}
