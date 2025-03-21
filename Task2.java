import java.util.Scanner;

class publication {
    protected String title;
    protected double price;

    publication() {
        title = "null";
        price = 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Title: ");
        title = sc.next();
        System.out.println("Enter Price: ");
        price = sc.nextDouble();
    }

    void setTitle(String t) {
        title = t;
    }

    String getTitle() {
        return title;
    }

    void setPrice(double p) {
        price = p;
    }

    double getPrice() {
        return price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

    //child class
    class book extends publication{
        private int pg_count;

        book(){
            pg_count = 0;
        }

        void input(){
            super.input();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter pg_count: ");
            pg_count = sc.nextInt();

        }

        void setPg_count(int pg){
            pg_count = pg;
        }
        int getPg_count(){
            return pg_count;
        }

        void display(){
            super.display();
            System.out.println("Total Pages: " + pg_count);
        }
    }

    // 2nd child class
    class tape extends publication{
        private int playingtime;

        tape(){
            playingtime = 0;
        }

        void input(){
            super.input();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Play_time: ");
            playingtime = sc.nextInt();
        }

        void setPlayingtime(int p1){
            playingtime = p1;
        }
        int getPlayingtime(){
            return playingtime;
        }

        void display(){
            super.display();
            System.out.println("Playing-Time: " + playingtime + "minutes");
        }
    }


public class Task2 {
    public static void main(String[] args) {
        book b1 = new book();
        Scanner In = new Scanner(System.in);

        b1.setTitle(In.next());
        b1.setPrice(In.nextDouble());
        b1.setPg_count(In.nextInt());
        b1.display();

        tape t1 = new tape();
        t1.input();
        t1.display();



    }
}
