import java.util.* ; 
public class TestDrive{
   public static void main(String[] args)
      {
       Student s = new Student("Kyaw  " , 1, 100,50,100);
       Student g = new GradeStudent() ; 
       Student u = new UnderGrade() ; 
       s.computeGrade() ; 
       g.computeGrade() ; 
       u.computeGrade() ; 
       s.display() ;  
   }
}
