public class UnderGrade extends Student{
	public UnderGrade(){ 
	}
   public void computeGrade() {
	  System.out.println(Student.getSubject1() ) ;
      double  average_mark = (Student.getSubject1() + Student.getSubject2() + Student.getSubject3() )/3; 
      System.out.println(average_mark) ; 
      if(average_mark > 65 && average_mark < 80){
          Student.setGrade('B') ; 
      }
   }
}
