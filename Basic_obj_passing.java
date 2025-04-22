class book{
    private String name;
    private String title;

    book(){
        name = "null";
        title = "null";
    }

    book(String n , String t){
        name = n;
        title = t;
    }

    void setTitle(String t){
        title = t;
    }

    String getTitle(){
        return title;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Title: " + title);
    }

    String updateTitle(book b, String newtitle){
        String t1 = this.title;
        String t2 = newtitle;
        this.title = newtitle;
        return newtitle;

    }


}

public class Basic_obj_passing {
    public static void main(String[] args) {
        book b1 = new book("PF" , "azx");
        b1.display();

        System.out.println("New-Title: " + b1.updateTitle(b1,"ABC"));



    }
}
