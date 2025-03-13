class distance{
    public double inches;
    public double feet;

    // constructor
    distance(){
        inches = 1;
        feet = 1;
    }

    distance( double i, double f ){
        inches = i ;
        feet = f;
    }
    void setInches(double a){
        inches = a;
    }
    double getinches(){
        return inches ;
    }

    void setFeet(double b){
        inches = b;
    }
    double getFeet(){
        return feet;
    }
    distance Add(distance d1){
        distance d3 = new distance();
        d3.feet = this.feet + d1.feet;
        d3.inches = this.inches + d1.inches;
        return d3;
    }
    void display(){
        System.out.print("Feet" + feet + "\n"+ "Inches"+ inches);
    }




}

public class Day3 {
    public static void main(String[] args) {
        distance d2 = new distance(4,6);
        distance d5 = new distance(6,8);
        distance d4 = d2.Add(d5);
        d4.display();


    }
}
