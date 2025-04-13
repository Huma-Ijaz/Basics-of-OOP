import java.util.Scanner;

class Person {
    private String name;
    private String E_mail;

    Person() {
        name = "null";
        E_mail = "null";
    }

    void Input(){
        System.out.println("Enter Name: ");
        Scanner sc = new Scanner(System.in);
        name= sc.next();
        System.out.println("Enter E-mail address: ");
        E_mail = sc.next();
    }

    void printallDetails() {
        System.out.println("Name: " + name + "\n" + "E-mail: " + E_mail);
    }
}


    class Student extends Person {
        protected String rollno;

        Student() {
            rollno = "null";
        }

        void Input(){
            super.Input();
            System.out.println("Enter Roll number: ");
            Scanner sc = new Scanner(System.in);
            rollno = sc.next();
        }

        void printalldetails() {
            super.printallDetails();
            System.out.println("Roll Number: " + rollno);
        }
    }

    class Teacher extends Person {
        protected String subj;

        Teacher() {
            subj = "null";
        }

        void Input(){
            super.Input();
            System.out.println("Enter Subject: ");
            Scanner sc = new Scanner(System.in);
            subj = sc.next();
        }


        void printalldetails() {
            super.printallDetails();
            System.out.println("Subjects: " + subj);
        }
    }



public class Real_WorldExample {
    public static void main(String[] args) {
      Student[] s1 = new Student[5];
      Teacher[] t1 = new Teacher[5];

      for(int i = 0; i<5 ; i++){
          s1[i] = new Student();
          s1[i].Input();
          t1[i] = new Teacher();
          t1[i].Input();
      }

      for(int i = 0; i < 5 ; i++){
          s1[i].printallDetails();
          t1[i].printallDetails();
      }


    }
}
