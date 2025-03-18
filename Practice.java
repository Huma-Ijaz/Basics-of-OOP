import java.util.Scanner;

class Math {

    private int x;
    private int y;
    private char op;

    Math(){
        x=0;
        y=0;
    }

    void setx(int a){
        x = a;
    }

    void sety(int b){
        y= b;
    }

    public void calculate (char op){
        if(op == '+'){
            System.out.print("Sum=" + (x + y));}

        else if (op == '-'){
            System.out.print("Subtract =" + (x - y));
        }
        else if(op == '*'){
            System.out.print("Multiplication=" + (x * y));}
        else if(op == '/'){
            System.out.print("Divide=" + (x / y));}
            else{
                System.out.println("Operator is not correct");
            }
        }
    }

    public class Practice {
    public static void main(String[]args){
        Math m = new Math();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter 1st number:");
//        m.setX(sc.nextInt());
//
//        System.out.print("Enter 2nd number:");
//        m.setY(sc.nextInt());
//
//        System.out.print("Enter Operator");
//        m.calculate(sc.next().charAt(0));

        // 2nd method
        m.setx(6);
        m.sety(7);
        m.calculate('*');


    }
}
