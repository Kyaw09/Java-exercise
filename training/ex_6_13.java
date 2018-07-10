public class ex_6_13{
     static  int n  ;
     static  double m ;  
      public ex_6_13(){
         n = 0 ;  
      }
      public static double  cal_Data(int i) {
             m += (double)i /(i+1) ;
	     if( i != n)
		   return  cal_Data(i+1) ; 
	     else
		    return m ;   
	 }
      public static void main(String[] args){
          java.util.Scanner input = new java.util.Scanner(System.in) ; 
          n = input.nextInt() ; 
          System.out.println(cal_Data(1) ) ;   
      }
  }
