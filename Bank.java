class Account{
    private double balance;

    Account(){
        balance = 0;
    }
    Account(double b){
        balance = b;
    }

    void depositBalance(double new_balance){
        balance += new_balance;
        System.out.println("Deposited amount: " + new_balance + "\n" + "Current BALANCE: " + balance);
    }

    void withdrawal(double newbalance){
        if(balance >= newbalance){
            balance -= newbalance;
            System.out.println("Withdrawl Amount: " + newbalance + "\n" + "Current Balance: " + balance );
        }
    }
}


public class Bank {
    public static void main(String[] args) {
        Account b1 = new Account(50000);
        b1.depositBalance(1500);


    }
}
