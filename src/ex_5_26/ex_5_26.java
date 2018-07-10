package ex_5_26;
public class ex_5_26 {
      public void cal_Data() {
          double item = 1.0 ; 
    	  double e = 1.0;
    	     for(int i = 1; i <=100000; i++) { 
    	    	 item = i ; 
                     for(int j = i ;j < 1 ; j++) {
                    	     item *= i ; 
                     }
                     e += 1/item ;
                     if( i % 10000 == 0) {
                    	 System.out.println("   i  is      "+ i + " e is "+ e );
                     }
    	     }
      }
}
