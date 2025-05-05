abstract class Person{
    private String name;
    Person(String n){
        name = n;
    }

    void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }
    void display(){
        System.out.println("Name: " + name);
    }
    public abstract boolean isOutStanding();
}

class Student extends Person{
    private double CGPA;

    Student(String n, double c){
        super(n);
        CGPA = c;
    }
    void setCGPA(double c){
        CGPA = c;
    }
    double getCGPA(){
        return CGPA;
    }
    public boolean isOutStanding(){
        if(CGPA > 3.5){
            return true;
        }
        else{
            return false;
        }
    }
    void display(){
        super.display();
        System.out.println("CGPA: " + isOutStanding());
    }
}

class Professor extends Person{
    private int Publications;

    Professor(String n, int p){
        super(n);
        Publications = p;
    }
    void  setPublications(int p){
        Publications = p;
    }
    int getPublications(){
        return Publications;
    }

    public boolean isOutStanding(){
        if(Publications>50){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    void display() {
        super.display();
        System.out.println("Publications: " + isOutStanding());
    }
}
public class Check_System {
    public static void main(String[] args) {
        Person[] P = new Person[4];
        P[0] = new Student("Huma", 3.73);
        P[1] = new Student("Saba", 3.02);
        P[2] = new Professor("ABC", 45);
        P[3] = new Professor("ABCD", 55);
//    P[3].setPublications(100);


        for (int i = 0; i < 4; i++) {
//            System.out.println( P[i].getName());
//            System.out.println( P[i].isOutStanding());
            P[i].display();
        }
    }
}
