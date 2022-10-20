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
}