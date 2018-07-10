import java.util.* ; 
public class MyComplexApp {
       public static void main(String[] args){
            Scanner input = new Scanner(System.in) ;
	    double real= 0 , imag = 0 ; 
	    boolean b = true ; 
	    MyComplex another = null ; 
	   do{
		  try{ 
	    System.out.print( "Enter complex number    :   " ) ; 
	     real = input.nextDouble() ; 
	     imag = input.nextDouble() ;
	    boolean bo = true ; 
	    do{
	    System.out.print("Enter e to edit or n to skip complex number  :    ") ;
	    char c = (input.next()).charAt(0) ;
	    if( c == 'n' ){
	        bo = false ;
	        b = false ; 	
	    }else if( c == 'e' ) {
	        bo = false ; 
		b = true ; 
	    }else{
	        bo = false ; 
		b = true ; 
	    }
	    }while(bo) ; 
            }catch(Exception ex){
	         System.out.println("You must enter double vaule < " + Double.MAX_VALUE);
	         input.nextLine() ; 	 
	   }
	   }while(b) ;
	   MyComplex MyCom = new MyComplex(real,imag) ; 
	   System.out.println(" The complex number is " + MyCom.toString() ) ;
	   System.out.print(" The complex number is ") ;
	   if(MyCom .isReal() == true) {
	       System.out.println(" is real number " ) ; 
	   }else if(MyCom .isImag() == true ){
	       System.out.println(" is imaginary " ); 
	   }else{
	       System.out.println(" is not poor  real and imaginary number ") ; 
	   }
           System.out.print("If you enter new complex number to compare exiting complex number or add or abstart or multiply or divde complex number , enter y or not enter n : " ) ; 
	   char ch = (input.next()).charAt(0) ;
	   double real1 = 0 ; 
	   double imag1 = 0 ;  
	   if(ch == 'y'){
	       System.out.print(" Enter complex number  " ) ;
	       boolean boo = true ; 
	      do{
		     try{ 
	       real1 = input.nextDouble() ; 
               imag1 = input.nextDouble() ; 
	        another  = new MyComplex(real1,imag1) ; 
		System.out.println("The second complex number is " + another.toString() )  ; 
	       if( MyCom.equals(another)){
	           System.out.println(MyCom.toString() + "is equal to " + another.toString() ) ; 
	       }else{
	           System.out.println(MyCom.toString() + "is not equal to " + another.toString() ) ; 
	       }
	       System.out.print("The megnitude of the first complex number is " + MyCom.magnitude() ) ; 
	       System.out.print("\n"+"The magnitude of the second complex number is"+ another.magnitude()+"\n" );
	             boo = false ; 
		     }catch(Exception ex ){
		       System.out.println( " You must enter double value " + Double.MAX_VALUE );
		       input.nextLine() ; 
		     }
	      }while(boo) ;
	      System.out.println( "The argument of the first complex number is in radians : " + MyCom.argumentInRadians() ) ; 
	  System.out.println("The argument of the second complex number is in radians : " + another.argumentInRadians() ) ; 
	  System.out.println("The argument of the first complex number is in Degree : "+ MyCom.argumentInDegrees() ) ; 
      System.out.println("The argument of the second complex number is in Degree : " + another.argumentInDegrees() ) ; 
      System.out.println("The conjugate of the firste complex number is  : " + (MyCom.conjugate()).toString() ) ; 
      System.out.println("The conjugate of the second complex number is  : " +(another.conjugate()).toString() );
      System.out.println("The add of two complex number is " + (MyCom.add(another)).toString() ) ;
      System.out.println("The subtract of two complex number is " + (MyCom.subtract(another)).toString() ) ; 
      System.out.println("The multiply of two complex number is " + (MyCom.multiplyWith(another)).toString() ) ;      System.out.println("The divide of two complex number is " + (MyCom.divideBy(another)).toString() ) ; 
	   }else{
	       System.out.println("The megnitude of the complex number is " + MyCom.magnitude() ) ; 
               System.out.println( "The argument of the complex number is in radians : " + MyCom.argumentInRadians() ) ;
  System.out.println("The argument of the  complex number is in Degree : "+ MyCom.argumentInDegrees() ) ; 
	       System.out.println( "The conjugate of the complex number is " + (MyCom.conjugate()).toString() ) ; 
	   }
       }
}
