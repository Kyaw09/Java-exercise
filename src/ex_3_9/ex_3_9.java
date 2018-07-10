package ex_3_9;

public class ex_3_9 {
    private int num ; 
    public ex_3_9() {
        this(0) ; 
    }
    public ex_3_9(int num) {
        this.num = num ; 
    }
    public void  cal_Data() {
	    int d= 0 , sum = 0  ;
	    int n = num ; 
        for(int i = 9 ; i > 1 ; i--){
	     d = num % 10 ; 
             sum += (d * i) ;
	     num /= 10 ; 
	}
        int j=0 ; 
        int nu = n ; 
     while(n > 0) {
    	 n /= 10 ;
    	 j++ ; 
     }
 	int ISBN = sum % 11 ;
     if( j == 9) {
    	 if( ISBN != 10){
    			System.out.println( " The 10th digit ISBN-10 is " + nu+ ISBN ) ; 
    		    }
    		    else {
    		       System.out.println( " The 10th digit ISBN-10 is "+nu +'X' ) ; 
    		    } 
     }else {
    	 if( ISBN != 10){
    			System.out.println( " The 10th digit ISBN-10 is " +'0' + nu + ISBN ) ; 
    		    }
    		    else {
    		       System.out.println( " The 10th digit ISBN-10 is "+'0'+nu+'X' ) ; 
    		    }
     }
}
}
