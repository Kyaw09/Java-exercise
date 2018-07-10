public class TestDrive{
   public static void main (String[] args){ 
       full_time_consultant f = new full_time_consultant("Aung" , 5000 , 400 , 30 , 10 ); 
       part_time_consultant pa = new part_time_consultant("Snag" , 5 , 3000 ) ; 
       System.out.println(f.toString()) ; 
       System.out.println(pa.toString()) ; 
   }
}
