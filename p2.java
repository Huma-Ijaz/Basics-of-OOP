//Encapsulation Practice
class Book{
    private String title;
    private int[] ratings;

    Book(String t, int[] r){
        title = t;
        ratings = r;
    }

    double Average(){
        int sum=0;
        for(int i = 0 ; i< ratings.length ;i++ ){
            sum = sum + ratings[i];
        }
        return sum /ratings.length;
    }

    String getTitle(){
        return title;
    }

    public int[] getRatings() {
        return ratings;
    }
}

public class p2 {
    public static void main(String[] args) {
        int[] ratings1 = {4,5,6,7,8};
        int[] ratings2 = {3,4,5,6,7};

        Book  b1 = new Book("PF", ratings1);
        Book b2 = new Book("Calculus" , ratings2);

        System.out.println(b1.getTitle() + "'s rating average is " + b1.Average());
        System.out.println(b2.getTitle() + "'s rating rating average " +b2.Average());

        double  avg1= b1.Average();
        double avg2 =  b2.Average();

        if(avg1> avg2){
            System.out.println(b1.getTitle() + "Book 1 has better average.");
        }
        else if (avg2 > avg1) {
            System.out.println( b2.getTitle()+"Book 2 has better average.");
        }
        else{
            System.out.println("Both have same average.");
        }

    }
}
