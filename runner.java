import java.util.Scanner;

class travel{
    private double km;
    private int hours;

    //Constructors
    travel(){
        km = 0.0;
        hours= 0;

    }
            void get(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Kilometers:");
            km = sc.nextDouble();

            System.out.println("Enter Hours:");
            hours = sc.nextInt();
        }

        void show(){
            System.out.println("Kilometers:" + km);
            System.out.println("Hours:" + hours);
        }
        void add(travel t){
            km = this.km + t.km;
            hours = this.hours + t.hours;
        }

}

public class runner {
    public static void main(String[] args) {
        travel t1 = new travel();
        System.out.println("Enter data for Travel1:");
        t1.get();

    }
}
