class Int{
    private int value;

    // Constructor
    Int(){
        value = 0;
    }

    Int(int m){
        value = m;
    }

    void display(){
        System.out.println("Value:" + value);
    }

    Int add (Int v) {
        Int v1 = new Int();
        v1.value = this.value + v.value;
        return v1;
    }


}

public class values {
    public static void main(String[] args) {
        Int v5 = new Int();

        Int v2 = new Int(10);
        v2.display();

        Int v3 = new Int(15);
        v3.display();

//        v5.add(v2);
//        v5.add(v3);

        Int v4 = v2.add(v3);
        System.out.println("Added Values:");
        v4.display();

       Int v6 = v5.add(v4);
        System.out.println("Placing response in uninitalized value:");
        v6.display();



    }
}
