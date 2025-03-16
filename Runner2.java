class Bank{
private String name;
private String account_no;
private String accounttype;
private int balance;
static int totalbalance;


//Constructors
    Bank(){
        name = "null";
        account_no = "null";
        accounttype = "null";
        balance = 0;

    }

    Bank(String n,int b){
        name = n;
        balance = b;

    }

    void withdraw(int b){
        if(balance >=  b){
            balance -= b;
            totalbalance = balance;
            System.out.println("Withdrawl Amount:" + b + "\n" +"Remaining Balance: " + totalbalance  );
        }
        else{
            System.out.println("Withdrawl is not possible");
        }

    }

    void deposit(int d){
        if(d>0){
            balance += d;
            totalbalance = balance;
            System.out.println("Deposited Amount:" + d + "\n" +"New Balance: " + totalbalance);
        }
    }

    void display(){
        System.out.println("Name" + name);
//        System.out.println("Updated Balance :" + totalbalance);

    }


}

public class Runner2 {
    public static void main(String[] args) {
        Bank b1 = new Bank("Huma" , 2000);
         b1.display();
         b1.deposit(4000);
         b1.withdraw(1000);


    }
}
