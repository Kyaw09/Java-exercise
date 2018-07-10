public class part_time_consultant extends Person{
   private  double num_hour_work ;
   private double num_hour_rate ; 
   public part_time_consultant(){
     super() ; 
   }  
   public part_time_consultant(String name , double num_hour_work , double num_hour_rate ){
      super.setName(name) ;  
      this.num_hour_work = num_hour_work ; 
      this.num_hour_rate = num_hour_rate ; 
   }
   public double computeSalary(){
      return this.num_hour_work * (this.num_hour_rate ) ; 
   }
   public String toString() {
      return "\n Name is " + super.getName() + "\n Number of hour is " + this.num_hour_work + "\n Number of hour rate is " + this.num_hour_rate  + "\n Salary is " + this.computeSalary() ; 
   }
}
