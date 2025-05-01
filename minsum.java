
import java.util.Scanner;
public class minsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n=sc.nextInt();
        int  m=sc.nextInt();
        int  a=sc.nextInt();
        int b=sc.nextInt();

        sum s = new sum();
        s.result(n,m,a,b); // Expected output: 2
    }
}

class sum {
    public void result(int n1, int m1, int a1, int b1) {
        // Option 1: All rides using normal tickets
        int option1 = n1 * a1;

        // Option 2: Special tickets for full sets + normal for leftover rides
        int fullSets = n1 / m1;
        int remaining = n1 % m1;

        int option2 = (fullSets * b1) + (remaining * a1);
        int option3 = ((n1 + m1 - 1) / m1) * b1;


        // Print the minimum of the two options
        int result = Math.min(option1, Math.min(option2,option3));
        System.out.println(result);
    }
}



// class sum{
//     public void result(int a,int b, int n, int m){
//         int option1= n*a;
//         int option2 = n/m;
//         option*b
//         int remain = n%m;
//         remain*a;
//         option result = (option*b )+(remain *a);
//     //     int normal = n*a;//normal price for each ride =a 1 for each ticket  for n rides
//     //     int special = n/b*m;//each special tickets offers 2 rides for 2 rebels
//     //     if(normal>special){
//     //         System.out.println(special);
//     //     }else if(normal<special){
//     //         System.out.println(normal);
//     //     }else{
//     //     System.out.println(normal);
//     // }
//     }
// }
// public class minsum{

//     public static void main(String[]args){
//         int a,b,n,m;
//         sum s = new sum();
//         s.result(2,1,4,3);
//     }
// }
