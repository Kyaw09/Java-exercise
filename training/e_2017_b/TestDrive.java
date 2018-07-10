import java.util.* ; 
public class TestDrive{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in) ; 
     System.out.print(" Enter x coordinates " ); 
     double x = input.nextDouble() ; 
     System.out.print(" Enter y coordinates " ) ; 
     double y = input.nextDouble() ; 
     MovablePoint m = new MovablePoint(x,y) ;
     System.out.print(" Enter number to moveup " ) ;
     m.moveUp(input.nextDouble()); 
     System.out.print(" Enter number to movedown " ) ;
     m.moveDown(input.nextDouble()); 
     System.out.print(" Enter number to moveleft " ) ; 
     m.moveLeft(input.nextDouble()); 
     System.out.print(" Enter number to moveright ") ; 
     m.moveRight(input.nextDouble()) ; 
     System.out.print(m.toString()) ;
  }
}
