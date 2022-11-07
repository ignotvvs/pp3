public class Clock {

    int hour,minute;
    int alarmHour, alarmMinute;
    
    public Clock() {
        hour = 0;
        minute = 0;
    }
    
    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    public void setClock(int h, int m) {
        hour = h;
        minute = m;
    }
    
    public void setClock() {
        hour = 0;
        minute = 0;
    }
    
    public void displayTime() {
        String h = hour<10 ? "0"+hour : Integer.toString(hour);
        String m = minute<10 ? "0"+minute : Integer.toString(minute);
        System.out.println(h + ":" + m);
    }
    
    public void addOneMinute() {
        if (minute == 59) {
            minute = 0;
            hour = hour==23 ? 0 : hour++;
        } else {
            minute++;
        }
        if (alarmHour == hour && alarmMinute == minute) {
            runAlarm();
        }
    }
    
    public void setAlarm(int h, int m) {
        alarmHour = h;
        alarmMinute = m;
    }
    
    public void runAlarm() {
        System.out.println("beep-beep-beep-beep !!");
    }
    
    public static void main(String[] args){
        Clock c1 = new Clock(12,47);
        c1.displayTime();
        c1.setClock(18,14);
        c1.displayTime();
        c1.setClock(9,3);
        c1.setAlarm(9,3);
        c1.displayTime();
        c1.setClock(23,58);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
    }
}