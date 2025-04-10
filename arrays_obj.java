import java.util.Scanner;

class student{
    public String id;
    public String name;
    public String dept;

    student(){
        id = "null";
        name = "null";
        dept = "null";
    }

    student(String i, String n, String d){
        id = i;
        name = n;
        dept = d;
    }

    void setName(String a){
        name = a;
    }
    String getName(){
        return name;
    }

    void input(){
       Scanner sc = new Scanner(System.in);
            id =sc.next() ;
            name = sc.next();
            dept = sc.next();

    }

    void display(){
        System.out.println("Enter id:");
        System.out.println("ID: "+ id);

        System.out.println("Enter Name:");
        System.out.println("Name: "+ name);

        System.out.println("Enter Department:");
        System.out.println("Department: "+ dept);
    }


}
public class arrays_obj {
    private static String Str;


    public static void main(String[] args) {
        student[] FA23 = new student[5];
        Scanner In = new Scanner(System.in);
        String str;
        str= In.next();

        for(int i = 0; i<5 ; i++){
            FA23[i]= new student();
            FA23[i].input();
        }

        for(int i = 0; i<5 ; i++){
            FA23[i]= new student();
            FA23[i].display();
        }
    }

}
