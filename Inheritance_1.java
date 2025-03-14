class person {
    private String name; // data members of parent class may be  "Private" or "protected"
    private int id;
    private String address;
    //Constructors of Parent class
    person() {
        name = "null";
        id = 0;
        address = "null";
//        System.out.println("Run at First"); // Just to check that which default constructor will run first either of Parent class or child class
    }
    person(String n, int i, String a) {
        name = n;
        id = i;
        address = a;
    }

    void setid(String i){
        name = i;
    }
    int getid(int iD){
        return iD;
    }

    void setAddress(String ad ){
        address = ad ;
    }
    String getAddress(String add){
        return add;
    }

    void setName(String n){
        name = n;
    }
    String getName(String na){
        return na;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
    }
}
    class student extends person{
        private int marks;
        private double fee; // data members of child class are always "Private"
        //Constructors
        student(){
            marks = 0;
            fee = 0.0;
//            System.out.println("Run at Second");
        }
        student(String na , int iD, String ad, int m, double f){
            super(na, iD , ad);
            marks = m;
            fee = f;

        }
        void display(){
            super.display();
            System.out.println("Marks: "+ marks);
            System.out.println("Fee: " + fee);
//            super.display(); // in display the parameters of super class depends on call , if call first then at display they will be shown first otherwise on the last
        }
    }

    public class Inheritance_1 {
    public static void main(String[]args){
        student s1 = new student("Huma", 40, "TBZC",100,50000);
        s1.display();
        System.out.println("Updated Data:");
        s1.setName("Iman");
        s1.display();
    }
}
