import java.util.* ; 
public class sortStudent{
  public static void main(String[] args){
     TreeMap<Double,String> m = new TreeMap<>();
     Scanner input = new Scanner(System.in) ;
     String name ; 
     double mark ;   
     System.out.println("Enter number of Student : " ) ; 
     int n = input.nextInt() ; 
     input.nextLine() ; 
     for(int i = 0 ; i< n ; i++){
        System.out.print("Enter Student name and mark  (You must enter no-space name) " ) ; 
	name = input.next(); 
	mark = input.nextDouble() ; 
	m.put(mark,name) ;
     }
     System.out.println(m.keySet()) ;
     System.out.println(m.values()) ; 
     for(double key : m.keySet()){
        System.out.println( " Student's name is " + m.get(key) + "\n mark is " + key ) ; } 
     System.out.println(m.descendingKeySet() ) ; 
     for(double k : m.descendingKeySet() ){
         System.out.println(" Student's name is " + m.get(k) + "\n mark is " + k ) ; 
    }
}
}
