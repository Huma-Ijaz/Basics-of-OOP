//public static void class printsum(int i, int n,double sum){
//    if(i == n){
//        sum += i;
//        System.out.println("Sum: " + sum);
//    }
//    sum += i;
//    System.out.println(i+1 , n ,sum);
//
//}

public class Recursion {
    public static void  printsum(int i, int n, double sum) {
    if(i==n){
            System.out.println("Sum: " + sum);
            return ;
        }

        sum +=i;
        printsum(i+1 , n, sum);
    }

        public static void main(String[] args) {
            printsum(5, 9,0);
        }
    }
