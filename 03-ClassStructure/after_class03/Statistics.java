public class Statistics {
    
    public static int numOfItems(int a, int b) {
        return b-a+1;
    }
    
    public static int sumOfNums(int a,int b) {
        int sum = 0;
        for (int i=a; i<=b; i++) {
            sum +=i;
        }
        return sum;
    }
    
    public static double avgOfNums(int a, int b) {
        return sumOfNums(a,b)/ (double) numOfItems(a,b);
    }
    
    public static void main(String[] args) {
        int sum = sumOfNums(5,10);
        int num = numOfItems(5,10);
        double avg = avgOfNums(5,10);
        System.out.println("Range: <5,10>\nNumber of items: " + num
                            + "\nSum of numbers: " + sum + "\nAverage of numbers: "
                            + avg);                    
    }
}