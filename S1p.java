class book{
    private String name;
    private String author_name;
    private int price;

    book(String n, String a, int p){
        name = n;
        author_name = a;
        price = p;
    }

    book(book obj){

        this.name = obj.name;
        this.author_name = obj.author_name;
        this.price = obj.price;
    }

    void display(){
        System.out.println("Book: " + name);
        System.out.println("Author: " + author_name);
        System.out.println("Price: " + price);
    }

    void setName(String na){
       name = na;
    }
}


public class S1p {
    public static void main(String[] args) {
        book oop = new book("Java","HSY",5000);
        oop.display();

        book oop2 = new book(oop);
        oop2.setName("PF");
        oop2.display();

//        book oop3 = new book(oop,pf);
//        oop3.display();

    }
}
