public class MyComplex{
     private double real ; 
     private double imag ; 
     public MyComplex(double real , double imag){
        this.real = real ; 
	this.imag = imag ; 
     }
     public void setReal(double real){
         this.real = real ; 
     }
     public void setImag(double imag){
         this.imag = imag ; 
     }
     public double getReal(){
       return  this.real ; 
     }
     public double getImag(){
       return this.imag ; 
     }
     public void setValue(double real , double imag){
         String complex = this.real + "+" + this.imag + "i" ; 	
     }
     public String toString() {
        return "("+real+ " =  " + imag + " i " + ")" ; 
     }
     public boolean isReal() {
        return (this.imag == 0) ; 
     }
     public boolean isImag() {
         return (this.real == 0 ) ; 
     }
     public boolean equals(double real , double imag ) {
         return (real == this.real && imag == this.imag ) ; 
     }
     public boolean equals(MyComplex another) {
         return (another.real == this.real && another.imag == this.imag ) ; 
     }
     public double magnitude() {
        return (Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imag,2) ) ) ; 
     }
     public double argumentInRadians() {
         return (Math.atan2(this.imag,this.real) ) ; 
     }
     public double argumentInDegrees() {
         return (Math.toDegrees(Math.atan2(this.imag,this.real)) ) ; 
     }
     public MyComplex conjugate() {
         return (new MyComplex(this.real , -this.imag )) ; 
     }
     public MyComplex add(MyComplex another ){
          return (new MyComplex((this.real+another.real) , (this.imag + another.imag ) ) ) ; 
     }
     public MyComplex subtract(MyComplex another ) {
          return (new MyComplex((this.real-another.real) ,  (this.imag - another.real ) ) ) ; 
     }
     public MyComplex multiplyWith(MyComplex another ){
          this.real =  ((this.real*another.real) - (this.imag * another.imag ) ) ;
	  this.imag =  ((this.real*another.imag)+ (this.imag*another.real)) ; 
	  return this ; 
     }
     public MyComplex divideBy(MyComplex another){
	     this.real = ((this.real * another.real )+ (this.imag * another.imag))/(Math.pow(another.real , 2) +Math.pow(another.imag , 2)) ; 
      this.imag = ((this.imag*another.real)-(this.real*another.imag))/(Math.pow(another.real,2) + Math.pow(another.imag,2) ); 
      return this ; 
     }
}
