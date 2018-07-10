public class example implements circle{
          public static double radius ; 
     public double getArea() {
        return radius*radius*Math.PI ; 
     }
     public double getPerimeter() {
        return 2*Math.PI*radius ; 
     }
     public static void main(String[] args){
          java.util.Scanner input = new java.util.Scanner(System.in) ; 
          System.out.print("Enter radius : " ) ; 
	  radius = input.nextDouble() ; 
	  example ex = new example() ; 
	  System.out.println(ex.getArea()) ; 
     }
  }
