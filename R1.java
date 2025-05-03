
class rectangle{
    private double length;
    private double width;

    rectangle(double l, double w){
        length = l;
        width = w;
    }

    void AreaofRectangle(){
        double area = length * width ;
        System.out.println("Area: " + area);
    }
}


public class R1 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(32 , 4);
        r1.AreaofRectangle();
    }
}
