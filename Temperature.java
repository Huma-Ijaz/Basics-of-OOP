abstract class Convert{
    protected double val1;
    protected double val2;

    Convert(double v1){
        val1 = v1;

    }
    public abstract double compute();
    public abstract void display();
}

class l_to_g extends Convert{

    l_to_g(double v1){
        super(v1);
    }
    @Override
    public double compute() {
        val2 = val1 * 0.264172;
        return val2;
    }
    public void display(){
        System.out.println("Value in Gallon: " + compute() + " gallons");
    }
}

class f_to_c extends Convert{
    f_to_c(double v1){
        super(v1);
    }
    @Override
    public double compute() {
        val2 = (val1 - 32)*5/9;
        return val2;
    }
    public void display(){
        System.out.println("Value in Celsius: " + compute() + " C");
    }
}

class fe_to_m extends Convert{
    fe_to_m(double v1){
        super(v1);
    }
    public double compute(){
        double M = val1 * 0.3048;
        return M;
    }

    public void display(){
        System.out.println("Value in Meters: " + compute() + " meter");
    }
}
public class Temperature {
    public static void main(String[] args) {
        Convert[] C = new Convert[3];
        C[0] = new f_to_c(50);
        C[1] = new l_to_g(40);
        C[2] = new fe_to_m(30);

        for(int i = 0; i<3 ; i ++){
            C[i].display();
        }

    }
}
