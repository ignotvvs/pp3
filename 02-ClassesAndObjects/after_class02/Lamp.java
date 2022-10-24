public class Lamp {
    
    //attributes
    boolean isOn;
    
    //methods
    public void switchOn() {
        isOn = true;
    }
    public void switchOff() {
        isOn = false;
    }
    public void displayStat() {
        if (isOn) {
            System.out.println("The lamp is on.");
        } else {System.out.println("The lamp is off");}
    }
    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();
        
        l1.switchOn();
        l2.switchOff();
        l1.displayStat();
        l2.displayStat();
    }
}