package ex_3_5; 
public class ex_3_5 {
     private int day ; 
     private int elasped_day ;
     private int future_day;
     public ex_3_5() {
           day = 0 ; 
	   elasped_day = 0 ;
	   future_day = 0 ; 
     }
     public ex_3_5(int day , int elasped_day ) {
         this.day = day ; 
	 this.elasped_day = elasped_day ; 
	 this.future_day = 0 ; 
     } 
     public void  setDay(int day) {
           this.day = day; 
     }
     public void  setElasped_day(int elasped_day) {
          this.elasped_day = elasped_day ; 
     } 
     public int  getDay() {
         return this.day ; 
     }
     public int  getElasped_day() {
	 return this.elasped_day ; 
     }
     public void cal_Data() {
         future_day = ( day + elasped_day ) % 7 ; 
	 System.out.print("\n"+ " Today is " ) ; 
	 switch(day) {
	    case 0 : System.out.print( " sunday " ) ; break ;
            case 1 : System.out.print( " monday " ) ; break ; 
            case 2 : System.out.print( " tuesday " ) ; break ; 
		case 3 : System.out.print( " wednesday " ) ; break ; 
		case 4 : System.out.print( " thursday " ) ; break ; 
		case 5 : System.out.print( " friday " ) ; break ; 
		case 6 : System.out.print( " saturday " ) ; 
	 }
	 System.out.print("\n"+" Futureday is " ) ; 
	 switch(future_day) {
	     case 0: System.out.print("Sunday"); break;
			case 1: System.out.print("Monday"); break;
			case 2: System.out.print("Tuesday"); break;
			case 3: System.out.print("Wednesday"); break;
			case 4: System.out.print("Thursday"); break;
			case 5: System.out.print("Friday"); break;
			case 6: System.out.print("Saturday");
	 }
     }
}