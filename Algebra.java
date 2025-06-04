class Simple{
    protected int num1;
    protected float num2; //float is used to get answer in float as int / float gives result in float type.

    Simple(int x , int y){
        num1 = x;
        num2 = y;
    }

    public boolean check(){
        if(num1>0 && num2>0){
            return true;
        }
        return false;
    }

    public double add(){
        double addition = num1 + num2;
        return addition;
    }

    public double subtract(){
        double subtraction = num1 - num2;
        return subtraction;
    }
    public double multiply(){
        double multiplication = num1 * num2;
        return multiplication;
    }
    public double divide(){
        double division = num1/num2;
        return division;
    }
    public void display(){
        System.out.println("Addition: " + add());
        System.out.println("Subtraction: " + subtract());
        System.out.println("Multiplication: " + multiply());
        System.out.println("Division: " + divide());
    }
}

class VerifiedSimple extends Simple{

    VerifiedSimple(int x , int y){
        super(x, y);
    }
    @Override
    public double add() {
        if(check() == true){
            return super.add();
        }
        System.out.println("Both number should be greater than 0.");
        return 0;
    }

    @Override
    public double subtract() {
        if(check()==true) {
            return super.subtract();
        }
        System.out.println("Both number should be greater than 0.");
        return 0;
    }

    @Override
    public double multiply() {
        if(check()==true) {
            return super.multiply();
        }
        System.out.println("Both number should be greater than 0.");
        return 0;
    }

    @Override
    public double divide() {
        if(check() == true) {
            return super.divide();
        }System.out.println("Both number should be greater than 0.");
        return 0;
    }

    @Override
    public void display() {
        super.display();
    }
}
public class Algebra {
    public static void main(String[] args) {
        VerifiedSimple S1 = new VerifiedSimple(3,8);
        S1.display();
    }
}
