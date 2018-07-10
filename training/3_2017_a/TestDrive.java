import java.util.* ; 
public class TestDrive{
   public static void main(String[] args){
	Student[] s = new Student[3] ; 
        Scanner input = new Scanner(System.in) ; 
	for(int i = 0 ; i < s.length ; i++ ){
	   System.out.print("Enter Student name : " ) ; 
	   String name = new String(input.next() ) ;
	   System.out.print("Enter roll number " ) ; 
	   int rollno = input.nextInt() ; 
	   System.out.print("Enter contest number " ) ; 
	   int contestno = input.nextInt() ; 
	   System.out.print("Enter mark ") ; 
	   double mark = input.nextDouble() ; 
	   s[i] = new ContestStudent(name,rollno,contestno,mark) ; 
	}
	Arrays.sort(s) ; 
	for(int i = 0 ;i < s.length ; i++){
		System.out.print(s[i].toString() + "\n" ) ; 
	        System.out.print(((ContestStudent)s[i]).d() + "\n" ) ; 
	}

   }
}
