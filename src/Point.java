public class Point {
    private double x ,y;

    //konstruktor
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //konstruktor bezargumentowy
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    //konstruktor kopiujacy
    public Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }

    //akcesor (getter)
    public double getX(){
        return x;
    }
    //mutator (setter)
    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    public String toSvg(){
        return"<circle r=\"2\" cx=\""+ this.x+"\"  " +
                "cy=\""+ this.y + "\" fill=\"red\" />";
    }

    public void translate(double dx, double dy){
        x+=dx;
        this.y +=dy;
    }
    public Point translated(double dx, double dy){
        Point newPoint=new Point();
        newPoint.x=x+dx;
        newPoint.y=y+dy;
        return newPoint;
    }
}