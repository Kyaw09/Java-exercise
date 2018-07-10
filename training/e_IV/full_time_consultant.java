public class full_time_consultant extends Person{
    private double daily_rate,overtime_rate,num_day_work,num_overtime_work ; 
    public full_time_consultant(){
       super() ; 
    }
 public full_time_consultant(double daily_rate , double overtime_rate , double num_day_work ,double  num_overtime_work ){
            super() ; 
	    this.daily_rate = daily_rate ; 
	    this.overtime_rate = overtime_rate ; 
	    this.num_day_work = num_day_work ; 
	    this.num_overtime_work = num_overtime_work ; 
    }
    public full_time_consultant(String name , double daily_rate , double overtime_rate , double mun_day_work , double num_overtime_work ) {
       super.setName(name) ; 
       this.daily_rate = daily_rate ; 
       this.overtime_rate = overtime_rate ; 
       this.num_day_work = num_day_work ; 
       this.num_overtime_work = num_overtime_work ; 
    }
    public double computeSalary(){
       return (this.daily_rate*this.num_day_work) + (this.overtime_rate * this.num_overtime_work ) ; 
    }
    public String toString(){
       return "\nName is " + super.getName() + "\nDaily Rate is" + this.daily_rate + "\nNumber of Day work is " + this.num_day_work + "\nOvertime Rate is " + this.overtime_rate + "\n number of overtime hours work is " + this.num_overtime_work+"\n Salary is " + this.computeSalary()  ; 
    }
}

