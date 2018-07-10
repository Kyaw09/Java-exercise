package ex_5_33;
public class ex_5_33 {
    public static void main(String[] args){
         ex_5_33 e= new ex_5_33() ; 
         e.cal_Data() ; 
   }

   public void cal_Data(){
     int result ;  
        for( int i = 1 ; i < 10000 ; i++) {
          result = 0 ;   
          for( int j = 1 ; j < i ; j++){
                 if( i % j == 0 ) {
                      result += j ; 
                 }
            }
            if( i == result ) {
               System.out.print(result + " " ) ; 
            }
        }
   }
  }