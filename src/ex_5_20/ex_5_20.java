package ex_5_20;

public class ex_5_20 {
    public void cal_Data() {
    int number ;
    int count = 0 ;   
    for ( number=2 ; number <= 1000 ; number++ ) {
             boolean b = true ; 
       for( int i = 2 ; i < number/2 ; i++ ) {
           if( number % i == 0){
                    b = false ;break ;        
} 
}
if(b) {
count++ ; 
if( count % 8 == 0 ) {
     System.out.println(number) ; 
}else{
     System.out.print(number+" ") ; 
}
}
}
}
}
