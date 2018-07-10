import java.util.* ; 
public class ex_8_3_sort_grade{
   public static void main(String[] args){ 
       char[][] answers = {
{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E','A','D'},
{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E','A','D'},
{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E','A','D'},
{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E','A','D'},
{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E','A','D'},
{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E','A','D'},
{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E','A','D'},
{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E','A','D'}};
       char[] key = {'D','B','D','C','C','D','A','E','A','D'} ; 
       int[] sort = new int[answers.length] ; 
       for( int i = 0 ; i < answers.length ; i++){
          for(int j = 0 ; j < answers[i].length ; j++){
	      if( key[j] == answers[i][j] ){
	         sort[i]++ ; 
	      }
	  }
	  System.out.println("Student" + i + "'s correct count is " + sort[i] ) ; 
       }
       for(int i = 0 ; i < sort.length ; i++){
          for( int j = 0;j < sort.length - 1 ; j++){
	      if( sort[j] <  sort[j+1] ){
	          int temp = sort[j] ; 
		  sort[j] = sort[j+1] ;  
	          sort[j+1] = temp ; 
	      }
	  }
       }
       System.out.println( " The student in increasing order of the number of correct number" ) ; 
       for(int i = 0 ; i < sort.length ; i++){
          System.out.println( "Student"+ i + "=" + sort[i] + "marks" ) ; 
       }
  }
}
