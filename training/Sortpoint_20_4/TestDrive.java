import java.util.* ; 
class Point implements Comparable<Point>{
    private double x ; 
    private double y ;
    public Point(){
    }
    public Point(double x , double y){
        this.x = x ; 
	this.y = y ; 
    }
    public void setX(double x){
        this.x = x ; 
    }
    public void setY(double y){
        this.y = y ; 
    }
    public double getX(){
        return this.x ; 
    }
    public double getY(){
        return this.y ; 
    }
    public int compareTo(Point p){
        if( this.x > p.x ){
	    return 1 ; 
	}else if(this.x < p.x ){
	    return -1 ; 
	}else if(this.y > p.y){
	    return 1 ;
	}else if(this.y < p.y){
	    return -1 ; 
	}else{
	    return 0 ; 
	}
    }
    public String toString(){
       return "x is " + x + "\n y is " + y  ; 
    }
}
class CompareY implements Comparator<Point>{
    public int compare(Point p1 , Point p2){
           if(p1.getY() > p2.getY() ){
	      return 1 ; 
	   }else if(p1.getY() < p2.getY() ){
	      return -1 ;
	   }else if(p1.getX() > p2.getX() ){
	      return 1 ; 
	   }else if(p1.getX() < p2.getX() ){
	     return -1 ; 
	   }else{
	     return 0 ; 
	   }
    }  
}
public class TestDrive{
   public static void main(String[] args){
       List<Point> l= new LinkedList<>() ; 
       Point[] p = new Point[4]  ; 
       for(int i = 0 ; i < p.length ; i++){
          p[i] = new Point(Math.random()*10 , Math.random()*10) ; 
       }
       Arrays.sort(p) ; 
       for(Point pa : p){
         System.out.println(pa.toString() ) ; 
       }
       Arrays.sort(p,new CompareY() ) ; 
       for(Point pa: p){
          System.out.println(pa.toString()) ; 
       }

   }
}
