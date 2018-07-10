public abstract class Student{
   private String name ; 
   private int rollNo ; 
   public Student(){
   }
   public Student(String name , int rollNo){
      this.name = name ; 
      this.rollNo = rollNo ; 
   }
   public void setName(String name ){
      this.name = name ; 
   }
   public void setRollNo(int rollNo){
      this.rollNo = rollNo ; 
   }
   public String getName(){
     return this.name ; 
   }
   public int getRollNo(){
    return this.rollNo ; 
   }
   public String toString(){
      return "\n Name is :"+this.name + "\n Roll No is " + this.rollNo ; 
   }
}
