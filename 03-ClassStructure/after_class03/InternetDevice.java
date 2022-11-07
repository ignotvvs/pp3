public class InternetDevice {
    
    String deviceName;
    static int devicesConnected=0;
    boolean isConnected;
    
    public InternetDevice(String name) {
        this.deviceName = name;
    } 
    
    public void connect() {
        isConnected = true;
        devicesConnected++;
    }
    
    public void disconnect() {
        isConnected = false;
        devicesConnected--;
    }
    
    public void isConnected() {
        if (isConnected) {System.out.println("The device is connected");}
        else {System.out.println("The device isn't connected."); }
    }
    
    public void displayStatus() {
        System.out.println("Device name: " + deviceName);
        this.isConnected();
    }
    
    public static void displayConnections() {
        System.out.println("The number of devices connected: " + devicesConnected);
    }

    public static void main(String[] args) {
        InternetDevice d1 = new InternetDevice("personal computer");
        InternetDevice d2 = new InternetDevice("laptop");
        InternetDevice d3 = new InternetDevice("tablet");
        InternetDevice d4 = new InternetDevice("smartphone");
        InternetDevice d5 = new InternetDevice("TV");
        
        d1.connect();
        d2.connect();
        d3.connect();
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
        d4.displayStatus();
        d5.displayStatus();
        displayConnections();
    }
}