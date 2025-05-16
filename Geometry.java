abstract class shape{
    protected int total_lines;
    protected String colour;
    protected String Fill_colour;


    shape(int t, String c,String f){
        total_lines = t;
        colour =c;
        Fill_colour =f;
    }

    public abstract String draw();

    public void display(){
        System.out.println("Total-Lines: " + total_lines);
        System.out.println("Pen Colour: " + colour);
        System.out.println("Fill Colour: " + Fill_colour);
        System.out.println("Shape: " + draw());
    }
}

class Circle extends shape{

    Circle (int t, String c,String f){
        super(t, c,f);
    }

    @Override
    public String draw() {
        System.out.println("It is a Circle.");
        return "C";
    }

    @Override
    public void display() {
        super.display();
    }
}

class Square extends shape{

   Square (int t, String c,String f){
       super(t, c,f);
   }

    @Override
    public String draw() {
        System.out.println("It is a Square.");
        return "S";
    }

    @Override
    public void display() {
        super.display();
    }
}

class Triangle extends shape{

   Triangle(int t, String c,String f){
       super(t, c,f);
   }

    @Override
    public String draw() {
        System.out.println("It is a Triangle.");
        return "T";
    }

    @Override
    public void display() {
        super.display();
    }
}


public class Geometry {
    public static void main(String[] args) {
        shape[] S = new shape[3];
        S[0] = new Circle(1,"Black","Brown");
        S[1] = new Square(4,"Red","Green");
        S[2] = new Triangle(3,"Blue","Pink");

        for(int i = 0; i<3 ; i++){
            S[i].display();

        }

    }
}
