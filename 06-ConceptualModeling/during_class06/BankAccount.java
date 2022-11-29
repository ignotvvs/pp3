public class BankAccount {

    private String owner, number;
    private int balance = 0;

    public BankAccount(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount && amount <= 500) {
            balance -= amount;
        } else if (amount > 500) {
            System.out.println("Can't withdraw amount larger than 500 PLN");
        } else {
            System.out.println("Withdrawal amount is larger than account balance.");
        }

    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
 
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Robert Linder", "2234051053");
        b1.deposit(500);
        b1.displayBalance();
        b1.deposit(200);
        b1.displayBalance();
        b1.withdraw(300);
        b1.displayBalance();
        b1.withdraw(1000);
        b1.withdraw(500);
        
        
    }

}