public class Rectangle {
    
    //attributes
    int length,width;
    
    //methods
    public void displayArea() {
        System.out.println("Rectangle's surface area: " + length*width);
    }
    public void displayPerim() {
        System.out.println("Rectangle's perimeter: " + 2*(length+width));
    }
    public void displayDim() {
        System.out.println("Length: " + length + "\nWidth: " + width);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.length = 4;
        r1.width = 3;
        r2.length = 7;
        r2.width = 2;
        
        r1.displayArea();
        r1.displayPerim();
        r1.displayDim();
    }
}