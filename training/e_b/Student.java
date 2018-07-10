public class Student{
   private String name ; 
   private int rollno ; 
   private  static double subject1 ;
   private  static double  subject2 ;
   private  static double  subject3 ; 
   private static  char grade ; 
   public Student(){
   }
   public Student(String name,int rollno,double subject1,double subject2,double subject3){
        this.name = name ; 
	this.rollno = rollno ; 
	this.subject1 = subject1 ; 
	this.subject2 = subject2 ; 
	this.subject3 = subject3 ;
   }
   public void setName(String name ){
      this.name = name ; 
   }
   public void setRollno(int rollno){
      this.rollno = rollno ; 
   }
   public void setSubject1(double subject1){
      Student.subject1 = subject1 ; 
   }
   public void setSubjetc2(double subject2){
      Student.subject2 = subject2 ; 
   }
   public void setSubject3(double subject3){
      Student.subject3 = subject3 ; 
   }
   public String getName(){
      return this.name ; 
   }
     public int  getRollno(){
      return this.rollno ;
   }
     public static double  getSubject1(){
      return Student.subject1 ; 
   }
  public static double getSubject2(){
      return Student.subject2 ; 
   }
  public static double getSubject3(){
      return Student.subject3 ; 
   }
   public static void setGrade(char grade){
      Student.grade = grade ; 
   }
   public static char getGrade(){
      return Student.grade ; 
   }
  public void computeGrade(){
      double average_mark= (this.subject1 + this.subject2 + this.subject3) / 3 ; 
      if(average_mark > 50 && average_mark < 65 )
	      this.grade =  'C' ; 
  }
  public void display(){
     System.out.println(" Student information " ) ; 
     System.out.println(" Name is : "+this.name + "\n Roll number is : " + this.rollno + "\n Subject1 is " + Student.subject1 + "\n Subject2 is " + Student.subject2 + "\n Subject3 is " + Student.subject3 + "\n Grade is " + Student.getGrade() ) ; 
  }
}
