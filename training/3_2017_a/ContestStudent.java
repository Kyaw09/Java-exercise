import java.lang.* ; 
public class ContestStudent extends Student implements Comparable<ContestStudent> {
     private int contestNo ; 
     private double mark  ; 
     public ContestStudent() {
        super() ; 
     }
     public ContestStudent(int contestNo , double mark ) {
         super() ; 
	 this.contestNo = contestNo ; 
	 this.mark = mark ; 
     }
     public ContestStudent(String name , int rollNo , int contestNo , double mark ){
         super(name,rollNo) ; 
	 this.contestNo = contestNo ; 
	 this.mark = mark ; 
     }
     public void setContestNo(int contestNo){
         this.contestNo = contestNo  ; 
     }
     public void setMark(double mark){
         this.mark = mark ; 
     }
     public int getContestNo(){
         return this.contestNo ; 
     }
     public double getMark(){
         return this.mark ; 
     }
     public int compareTo(ContestStudent e ){
       if(getMark() > e.getMark() )
	       return -1 ; 
       else if(getMark() < e.getMark() )
	       return 1 ; 
       else 
	       return 0 ; 
     }
     public  String toString(){
        return super.toString() + "\n Contest number is " + this.contestNo + "\n Mark is " + this.mark ; 
     }
     public static String d(){
        return "ss" ; 
     }
}
