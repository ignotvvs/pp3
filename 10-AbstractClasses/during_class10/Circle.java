package during_class10;

public class Circle extends Shape{
    double pi = 3.14;
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return pi*Math.sqrt(r);
    }

    @Override
    public double perimeter() {
        return 2*pi*r;
    }

    
    
}
