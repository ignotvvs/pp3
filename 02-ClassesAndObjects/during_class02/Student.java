public class Student {
    
    //Wykaz atrybutów
    String name;
    int age;
    String studentId;
    boolean isValid;
    int semesterNum;
    double averageGrade;
    
    //Wykaz metod
    public void sayHello() {
        System.out.println("Hi!");
    }
    public void displayName() {
        System.out.println("My name is "+ name);
    }
    public void displayAge() {
        System.out.println("My age is "+ age);
    }
    public void displayInfo() {
        System.out.println("Name: " + name + "\nSemester number: " + semesterNum +
        "\nAverage grade: "+ averageGrade);
    }
    public void changeIdStat() {
        isValid = !isValid;
    }
    public void displayId() {
        System.out.println("Name: " + name + "\nID card number: " + studentId +
        "\nThe ID card is "+ isValid);
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Mike";
        s1.age = 19;
        s1.studentId = "1233456";
        s1.isValid = true;
        s1.semesterNum = 3;
        s1.averageGrade = 3.6;
        s1.displayId();
        s1.changeIdStat();
        s1.displayId();
    }
    
}