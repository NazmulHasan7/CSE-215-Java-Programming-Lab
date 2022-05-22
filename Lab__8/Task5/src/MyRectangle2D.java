
public class MyRectangle2D {
    private double x , y ;
    private double width , height ;
    
    public MyRectangle2D(){
        x = y = 0 ;
        width = height = 1 ;
    }
    public MyRectangle2D(double x , double y,double width,double height){
        this.x = x ;
        this.y = y ;
        this.width = width ;
        this.height = height ;
    }
    public double getPerimeter (){
        return 2*(width+height);
    }
    public double getArea(){
        return width * height ;
    }
    public boolean contains (double x, double y){
        return Math.abs(x-this.x) <= width/2 && Math.abs(y-this.y) <= height/2 ;
    }
    public boolean contains (MyRectangle2D r){
        return (contains(r.x -r.width /2 , r.y+r.height /2) &&
                contains(r.x -r.width /2 , r.y-r.height /2) &&
                contains(r.x +r.width /2 , r.y+r.height /2) &&
                contains(r.x +r.width /2 , r.y-r.height /2)) ;
    }
     public boolean overlaps (MyRectangle2D r){
        return Math.abs(r.x-x) <= (r.width+width)/2 && Math.abs(r.y-y) <=(r.height+height)/2 ;
    }
}
