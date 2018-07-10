public class MovablePoint implements Movable{
    private double x , y ; 
    public MovablePoint(){
       super() ; 
    }
    public MovablePoint(double x , double y){
       super() ; 
       this.x = x ; 
       this.y = y ; 
    }
    public void setX(double x ){
       this.x = x ; 
    }
    public void setY(double y){
       this.y = y ; 
    }
    public double getX() {
       return this.x ; 
    }
    public double getY() {
       return this.y ; 
    }
    public String toString(){
        return "\n x is " + this.x + "\n y is" + this.y ; 
    }
    public void moveUp(double y ){
        this.y += y ; 
    }
    public void moveDown(double y){
        this.y -= y ; 
    }
    public  void moveLeft(double x ){
       this.x -= x ; 
    }
    public void moveRight(double x){
        this.x += x ; 
    }
}
