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
}