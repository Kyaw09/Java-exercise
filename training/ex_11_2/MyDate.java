import java.util.*;  
public class MyDate{
   private int year ; 
   private int month ; 
   private int day ; 
   public MyDate(){
       GregorianCalendar calendar = new GregorianCalendar() ; 
       this.year = calendar.get(GregorianCalendar.YEAR) ; 
       this.month = calendar.get(GregorianCalendar.MONTH) ; 
       this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH) ; 
   }
   public MyDate(long elapsedTime){
	   setDate(elapsedTime) ; 
   }
   public MyDate(int year , int month , int day){
      this.year = year ; 
      this.month = month ; 
      this.day = day ; 
   }
   public void setyear(int year){
       this.year = year ; 
   }
   public void setmonth(int month){
      this.month = month ; 
   }
   public void setday(int day){
      this.day = day ; 
   }
   public int getyear(){
      return this.year ; 
   }
   public int getmonth(){
      return this.month ; 
   }
   public int getday(){
      return this.day ; 
   }
   public void setDate(long elapsedTime){
      GregorianCalendar calendar = new GregorianCalendar() ; 
      calendar.setTimeInMillis(elapsedTime) ; 
      this.year = calendar.get(GregorianCalendar.YEAR) ; 
      this.month = calendar.get(GregorianCalendar.MONTH) ; 
      this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH) ; 
   }
   
}
