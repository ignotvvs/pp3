import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private ArrayList<String> products = new ArrayList<String>();
    private int number = products.size();

    public void addProduct(String product) {
        products.add(product);
        number = products.size();
    }
    
    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        products.add(product);
        sc.close();
        number = products.size();
    }

    public int getNumber() {
        return number;
    }
    
    public ArrayList<String> getProducts() {
        return products;
    }

    public static void main(String[] args) {
        ShoppingList s1 = new ShoppingList();
        System.out.println(s1.getProducts());
        System.out.println(s1.getNumber());
        s1.addProduct("Bears");
        s1.addProduct("Beets");
        s1.addProduct("Battlestar Galactica");
        System.out.println(s1.getProducts());
        System.out.println(s1.getNumber());
        s1.addProduct();
        System.out.println(s1.getProducts());
        System.out.println(s1.getNumber());
    }

    
}
