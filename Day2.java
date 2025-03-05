import java.util.Scanner;

class date{
    public int day;
    public String month;
    public int year;
    //construtors
    date(){
        day = 0;
        month = null;
        year = 0;
    }

    date(int d, String m, int y){
        day = d ;
        month = m;
        year = y;
    }
    // set & get functions
    void setDay(int a){
        day = a;
    }
    int getDay(){
        return  day;
    }

    void setMonth(String  b){
        month = b;
    }
    String getMonth(){
        return  month;
    }

    void setYear(int c){
        year = c;
    }
    int getYear(){
        return year;
    }
    // input function
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day: ");
        day = sc.nextInt();

        System.out.println("Enter Month: ");
        month = sc.next();

        System.out.println("Enter Year: ");
        year = sc.nextInt();

    }

    // Display Function
    void display(){
        System.out.println("Today Date is " + day + " - " + month + " - " + year );
    }
}
public class Day2 {
    public static void main(String[]args){
        // object creation
        // output through constructor
//        date d1 = new date();
//        d1.day = 2;
//        d1.month = "March";
//        d1.year = 2024;
//        d1.display();
        //output through input fun
        date d2 = new date();
        d2.input();
        d2.display();
        //output through set & get fun
//        date d3 = new date();
//        d3.setDay(6);
//        d3.setMonth("May");
//        d3.setYear(2023);
//        d3.display();


    }
}
