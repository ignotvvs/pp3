package during_class10;

public class Triangle extends Shape{
    private int a,b,c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = 0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    
}
