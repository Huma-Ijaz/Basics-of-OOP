class Student{
   private String name;
   private int age;

   Student(){
       name=  "null";
       age = 0;
   }

   Student(String n, int a){
       name = n ;
       age = a;
    }

    String getname(){
       return name;
    }

    int getAge(){
       return age;
    }

    static void printstudentinfo(Student s){
        System.out.println("Name: " + s.getname());
        System.out.println("Age: " + s.getAge());

   }

   void display(){
       System.out.println(name + age);
   }


}

public class st_1 {
    public static void main(String[] args) {
        Student s1 = new Student("Huma" , 18);
        s1.display();





    }
}
