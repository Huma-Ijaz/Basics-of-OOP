// Parent Class
class  person{
    protected String name;
    protected String address;
    protected String e_mail;
    protected String  phone;

    person(){
        name = "null";
        address = "null";
        e_mail = "null";
       phone = "null";
    }
    person(String n,String a, String e, String p){
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

    student(String n, String a, String e, String p, String d) {
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
        private dateHired d;

        employee(){
            office = "null";
            salary = 0;
        }
        employee(String n,String a, String e, String p,String o, int s,dateHired d1){
            super(n,a,e,p);
            office = o;
            salary = s;
            d = d1;
        }

        void display(){
            super.display();
            System.out.println("Department: " + office +"\n" + "Salary: " + salary);
            d.display();
        }

    }

    // Date class to create an object
    class dateHired{
        private int day;
        private String month;
        private int year;

        dateHired(){
            day = 0;
            month ="null";
            year = 0;
        }
        dateHired(int d,String m, int y){
            day = d;
            month = m;
            year = y;
        }

        void display(){
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
        faculty(String n,String a, String e, String p,String o, int s,int h, String r,dateHired d1){
            super(n,a,e,p,o,s,d1);
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
        staff(String n,String a, String e, String p,String o, int s,String t,dateHired d1){
            super(n,a,e,p,o,s,d1);
            title = t;
        }

        void display(){
            super.display();
            System.out.println("Designation: " + title );
        }
    }



public class Task1 {
    public static void main(String[] args) {
        dateHired d2 = new dateHired(4,"May",2025);
//        d2.display();
        employee e1 = new employee("Huma","TBZS*28","humaijaz@gmail.com","03270483539","Zones",10000,d2);
        e1.display();
    }
}
