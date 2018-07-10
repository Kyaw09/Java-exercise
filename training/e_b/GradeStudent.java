public class GradeStudent extends Student{
     public GradeStudent(){
        
     }
     public void  computeGrade(){
        double average_mark = (Student.getSubject1() + Student.getSubject2() + Student.getSubject3() ) / 3 ; 
	if(average_mark > 80 )
		Student.setGrade('A') ; 
     }
}
