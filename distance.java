class point1{
    private double x;
    private double y;

    point1(){
        x=0;
        y=0;
    }

    point1(double x, double y){
        this.x = x;
        this.y =y;
    }

    void calculatedistance(point1 p2){
        double r1 = (p2.x - this.x)*(p2.x - this.x);
        double r2 = (p2.y - this.y)*(p2.y - this.y);
        double r3 = Math.sqrt(r1 + r2);
        System.out.println("Distance: " + r3);
    }
}
public class distance {
    public static void main(String[] args) {
        point1 coordinates1 = new point1(2,4);
        point1 coordinates2 = new point1(6,8);
       coordinates1.calculatedistance(coordinates2);
    }
}
