import java.security.PrivateKey;

class TV {
  private int ch ;
    private int vol  ;
   private boolean on = false ;

    //constructor
    TV() {
        ch=1;
    }

    void turn_on() {
        on = true;
    }

    void turn_off() {
        on = false;
    }

   void vol_high() {
        if (on && vol <= 20) {
            vol++;
        }
    }

    void vol_low() {
        if (on && vol > 0) {
            vol--;
        }
    }

   void ch_up() {
        if (on && ch <= 250) {
            ch++;
        }
    }

     void ch_down() {
        if (on && ch > 1) {
            ch--;
        }
    }

    void setCh(int a) {
        if (on && ch >= 1 && ch <= 250) {
            ch = a;
        }
    }
    int getCh()
    {
        return ch;
    }

    void setvol(int b) {
        if (on && vol >= 10 && ch < 1) {
            vol = b;
        }
    }
}
public class Remote_class {
    public static void main(String[]args){
        TV s1 = new TV();
        s1.turn_on();
        s1.setCh(40);
        s1.setvol(15);

        System.out.println("Tv Channel is " + s1.getCh());
        System.out.print("Tv Volume is " + s1.getCh());


//        s1.ch_down();
//        s1.vol_high();

//        System.out.println("Tv Channel is " + s1.ch);
//        System.out.print("Tv Volume is " + s1.vol);

//        set1.ch_down();

    }
}
