public abstract class  Person{
    private String name ;
    public Person(){
    } 
    public void setName(String name){
       this.name = name ; 
    }
    public String getName(){
       return this.name ; 
    }
    public abstract double computeSalary();
    public String toString(){
       return "\nName is " + this.name ; 
    } 
}
