class Point{
    private double x;
    private double y;

    Point(){
        x = 0;
        y = 0;
    }

    Point(double c, double d){
        x= c;
        y=d;
    }

    void setX(double x1){
        x = x1;
    }

    double getX(){
        return x;
    }

    void setY(double y1){
        y = y1;
    }

    double getY(){
        return y;
    }

    static void swapPoint( Point a,Point b){

       double x1 = a.getX();
       double y1 = b.getY();

       a.setX(b.getX());
       a.setY(b.getY());

       b.setX(x1);
       b.setY(y1);
    }

    void display(){
        System.out.println("Value of X: " + x);
        System.out.println("Value of Y: " + y);
    }
}

public class P1 {
    public static void main(String[] args) {
        Point p1 = new Point(4,3);
        p1.display();

        Point p2 = new Point(8,9);
        p2.display();

        Point.swapPoint(p1,p2);
        System.out.println("After Swap: ");
        System.out.println("Point1: ");
        p1.display();

        System.out.println("Point2: ");
        p2.display();






    }
}
