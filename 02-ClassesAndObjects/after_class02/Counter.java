public class Counter {
    
    //attributes
    int value = 0;
    
    //methods
    public void resetToInit() {
        value = 0;
    }
    public void changeByOne(boolean increase) {
        if (increase) {
            value++;
        } else {value--;}
    }
    public void changeByTen(boolean increase) {
        if (increase) {
            value+=10;
        } else {value-=10;}
    }
    public void showCounter() {
        System.out.println("Counter value: " + value);
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.value = 23;
        c2.value = -47;
        
        c1.changeByOne(true);
        c1.showCounter();
        c2.changeByTen(false);
        c2.showCounter();
    }
}