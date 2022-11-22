import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setIsVege(true);
        p1.setProductName("Soy milk");
        System.out.println("Product name: " + p1.getProductName() + "\nVegeterian: " + p1.getIsVege());
        System.out.println();
        Game g1 = new Game();
        g1.setGameName("Cyberpunk 2077");
        g1.setDeveloper("CD Projekt RED");
        g1.setYearReleased(2020);
        g1.setPlatforms(new String[] {"PC","PS4","PS5","Xbox Series X/S","Xbox One","Stadia"});
        System.out.println("Game name: " + g1.getGameName() + "\nDeveloper: " + g1.getDeveloper()
                    + "\nYear released: " + g1.getYearReleased() + "\nPlatforms: " + Arrays.toString(g1.getPlatforms()));
    }
}
