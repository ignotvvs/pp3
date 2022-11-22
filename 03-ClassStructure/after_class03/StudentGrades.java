import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    
    String studentName;
    double[] grades;

    public StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    
    StudentGrades(String name, int numberOfGrades) {
        Random rd = new Random();
        grades = new double[numberOfGrades];
        int min = 2;
        int max = 5;
        for (int n=0; n < grades.length; n++) {
            double step = rd.nextBoolean() ? 0.5 : 0;
            double num = rd.nextInt(max-min) + min + step;
            grades[n] = num;
        }
    }
    
    StudentGrades(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of grades: ");
        int num = sc.nextInt();
        grades = new double[num];
        for (int n=0; n<num; n++) {
            System.out.println("Enter (comma separated) grade nr " + (n+1) + ": ");
            grades[n] = sc.nextDouble();
        }
        sc.close();
    }
    
    public double lowestGrade() {
        double low = grades[0];
        for (double n: grades) {
            if (n<low) {low=n;}
        }
        return low;
    }
    
    public double highestGrade() {
        double high = grades[0];
        for (double n: grades) {
            if (n>high) {high=n;}
        }
        return high;
    }
    
    public int numGrade() {
        return grades.length;
    }
    
    public double avgGrade() {
        double sum = 0;
        for (double n:grades) {
            sum+=n;
        }
        return sum/grades.length;
    }
    
    public void displayStudentDets() {
        System.out.println("Student's name: " + studentName + "\nGrades: " + Arrays.toString(grades)
                            + "\nNumber of grades: " + this.numGrade() + "\nLowest: "
                            + this.lowestGrade() + "\nHighest: " + this.highestGrade()
                            + "\nAverage:" + this.avgGrade());
    }
    
    public static void main(String[] args) {
        StudentGrades s1 = new StudentGrades("Amanda",new double[] {3.5,4.5,4.0,2.0,5.0,3.5,3.5});
        StudentGrades s2 = new StudentGrades("James",new double[] {2.0,3.0,2.0,4.5,4.5});
        s1.displayStudentDets();
        s2.displayStudentDets();
        
        StudentGrades s3 = new StudentGrades("Leo",3);
        s3.displayStudentDets();
        
        StudentGrades s4 = new StudentGrades("Mike");
        s4.displayStudentDets();
    }
}