import java.util.* ; 
ipublic class ex_7_3{ 
     public void cal_Data() {
        Scanner input = new Scanner(System.in) ; 
	int i = -1 ;
	int[] a = new int[100] ;
        int num ; 	
        System.out.print("Enter the integers between 1 and 100: " ) ; 	 
        do{
		i++ ; 
	   num  = input.nextInt() ; 
	   if(num >= 1 && num <= 100 ){
	       a[num-1]++ ; 
	   }
	}while(num != 0) ; 
	/*int[] arr = new int[100] ; 
	for(int j = 0 ; j < i ; j++){
	    for( int z = 0 ; z < i ; z++){
	       if(a[j] == a[z] ){
	           arr[j]++ ; 
		    
	        
	    } 
	}*/
	for(int j = 0 ; j < i ; j++ ){
	   if(a[j] > 0 ) 
	   System.out.println((j+1)+"occurs " + a[j] + "time" +(a[j] > 1? "s" : "" )) ; 
	}
     }
     public static void main(String[] args){
         ex_7_3 ex = new ex_7_3() ; 
	 ex.cal_Data() ; 
     }
}
