class Course{
    private String c_title;
    private int credit_hours;

    Course(){
        c_title = "null";
        credit_hours = 0;
    }

    Course(String t, int h){
        c_title = t;
        credit_hours= h;
    }

    Course(Course c1){
        this.c_title = c1.c_title;
    }

    boolean comparecourses(Course c ){
        return this.c_title.equals(c.c_title);
    }

    void display(){
        System.out.println("Title: " + c_title);
        System.out.println("Credit Hours: " + credit_hours);
    }
}

class Student{
    private String name;
    private int id;

    System
}


public class b1 {
    public static void main(String[] args) {

    }
}