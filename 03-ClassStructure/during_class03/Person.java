import java.lang.Math; 

public class Person {
    
    String name;
    double weight, height, bmi;
    
    public Person(String n,int h, double w) {
        name = n;
        height = h;
        weight = w;
    }
    
    public Person(String n) {
        name = n;
    }
    
    public void setWeightAndHeight(int h, double w) {
        this.height = h;
        this.weight = w;
    }
    
    public double calculateBMI() {
        bmi = weight/Math.pow(height/100,2);
        return bmi;
    }
    
    public void displayRecord() {
        System.out.println("Name: " + name + "\nWeight: " + weight
                            + "\nHeight: " + height + "\nBMI: " + bmi);
        if (bmi < 15.5) {
            System.out.println("BMI too low.");
        } else if (bmi > 24.9) {
            System.out.println("BMI too high.");
        }
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Mike",172,50.2);
        p1.calculateBMI();
        Person p2 = new Person("Jack");
        p2.setWeightAndHeight(190,92);
        p2.calculateBMI();
        Person p3 = new Person("Miles",184,84.5);
        p3.calculateBMI();
        
        p1.displayRecord();
        System.out.println();
        p2.displayRecord();
        System.out.println();
        p3.displayRecord();
    }
}