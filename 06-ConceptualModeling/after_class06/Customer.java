public class Customer {
    private String customerId, name;
    private int wallet;

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public Customer(String customerId, String name, int wallet) {
        this.customerId = customerId;
        this.name = name;
        this.wallet = wallet;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public void buyProduct(int price) {
        wallet-=price;
    }
    
}
