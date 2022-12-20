package during_class10;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Circle c1 = new Circle(3);
        Triangle t1 = new Triangle(3, 4, 5);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println();
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println();
        System.out.println(t1.area());
        System.out.println(t1.perimeter());
        System.out.println();
        System.out.println();

        SMS s1 = new SMS("123456789","hey!");
        System.out.println(s1.send());
        System.out.println();
        

        Email e1 = new Email("email message 1","subject1", "recipient1");
        System.out.println(e1.send());

    }
}