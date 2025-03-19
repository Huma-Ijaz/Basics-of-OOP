// Parent Class
class  person{
    protected String name;
    protected String address;
    protected String e_mail;
    protected long phone;

    person(){
        name = "null";
        address = "null";
        e_mail = "null";
       phone = 0;
    }
    person(String n,String a, String e, int p){
        name = n;
        address = a;
        e_mail= e;
        phone = p;
    }
    void display(){
        System.out.println("Name: "+ name+"\n"+"Address: "+address+"\n"+"E-mail Address: "+ e_mail + "\n" + "Phone Number: " + phone);
    }
}

// 1st Child Class
class student extends person {
    private String dep;

    student() {
        dep = "null";
    }

    student(String n, String a, String e, int p, String d) {
        super(n, a, e, p);
        dep = d;
    }

    void display() {
        super.display();
        System.out.println("Department: " + dep);
    }
}

    // 2nd Child Class
    class employee extends person{
        private String office;
        private int salary;

        employee(){
            office = "null";
            salary = 0;
        }
        employee(String n,String a, String e, int p,String o, int s){
            super(n,a,e,p);
            office = o;
            salary = s;
        }

        void display(){
            super.display();
            System.out.println("Department: " + office +"\n" + "Salary: " + salary);
        }

    }

    // Date class to create an object
    class dateHired extends employee{
        private int day;
        private String month;
        private int year;

        dateHired(){
            day = 0;
            month ="null";
            year = 0;
        }
        dateHired(String n,String a, String e, int p,String o, int s,int d,String m, int y){
            super(n,a,e,p,o,s);
            day = d;
            month = m;
            year = y;
        }

        void display(){
            super.display();
            System.out.println("Date: " + day + "-"+ month +"-"  + year );

        }
    }
// 1st sub-child class of child Employee
    class faculty extends employee{
        private int working_hours;
        private String rank;

        faculty(){
            working_hours = 0;
            rank = "null";
        }
        faculty(String n,String a, String e, int p,String o, int s,int h, String r){
            super(n,a,e,p,o,s);
            working_hours = h;
            rank = r;
        }
        void display(){
            super.display();
            System.out.println("Working-Hours: " + working_hours +"\n" + "Rank: " + rank);
        }
    }
    // 2nd sub-child class of child Employee
    class staff extends employee{
        private String title;

        staff(){
            title = "null";
        }
        staff(String n,String a, String e, int p,String o, int s,String t){
            super(n,a,e,p,o,s);
            title = t;
        }

        void display(){
            super.display();
            System.out.println("Designation: " + title );
        }
    }



public class Task1 {
    public static void main(String[] args) {

        dateHired d1 = new dateHired("Huma ","TBZS*6","humaijaz@gmail",0327-548-3539,"Computer Science",50000, 18 , "March" , 2025);
        d1.display();

    }
}
