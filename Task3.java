class computer {
    private int wordsize; // in bits
    private int memorysize; // in bytes
    private int storagesize; // in megabytes
    private int speed; // in mehahertz

    computer() {
        wordsize = 0;
        memorysize = 0;
        storagesize = 0;
        speed = 0;
    }

    computer(int w, int m, int s, int sp) {
        wordsize = w;
        memorysize = m;
        storagesize = s;
        speed = sp;
    }

    void display() {
        System.out.println("Word-Size in bits: " + wordsize);
        System.out.println("Memory-Size in bytes: " + memorysize);
        System.out.println("Storage-Size in mega-bytes: " + storagesize);
        System.out.println("Speed in mega-hertz: " + speed);
    }
}

    class laptop extends computer{
        private int length;
        private int width;
        private int height;
        private int weight;

        laptop(){
            length = 0;
            width = 0;
            height=0;
            weight=0;
        }
        laptop(int w, int m, int s, int sp,int l, int wi, int h,int we){
            super(w,m,s,sp);
            length = l;
            width = wi;
            height =h;
            weight = we;

        }

        void display(){
            super.display();
            System.out.println("Length: "+ length +"\n" + "Width: "+ width+"\n" + "Height: "+ height+"\n" + "Weight: " + weight );
        }
    }





public class Task3 {
    public static void main(String[] args) {
        laptop l1 = new laptop(20,23,24,25,26,28,30,29);
        l1.display();
    }
}
