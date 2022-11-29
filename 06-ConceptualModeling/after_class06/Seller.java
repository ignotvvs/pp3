public class Seller {

    private String sellerId, name;
    private int income;
    
    public void setIncome(int income) {
        this.income = income;
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getName() {
        return name;
    }

    public int getIncome() {
        return income;
    }

    public Seller(String sellerId, String name, int income) {
        this.sellerId = sellerId;
        this.name = name;
        this.income = income;
    }

    public void sellProduct(int price) {
        income+=price;
    }

}
