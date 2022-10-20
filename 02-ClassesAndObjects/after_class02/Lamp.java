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
}