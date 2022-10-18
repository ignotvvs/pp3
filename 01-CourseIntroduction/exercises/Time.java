public class Time {

    public static void main(String[] args) {
        int hour = 13;
        int minute = 25;
        int second = 13;
        int toMidHour = 24 - 1 - hour;
        int toMidMinute = 60 - 1 - minute;
        int toMidSecond = 60 - second; 
        System.out.println("Numbers of seconds since midnight: " + (hour*3600 + minute*60 + second));
        System.out.println("Number of seconds remaining in the day: " + (toMidHour*3600 + toMidMinute*60 + toMidSecond));
        int secondsInMid = 24 * 3600;
        int secondsPassed = hour*3600 + minute*60 + second;
        double percentOfTime = (double) secondsPassed / secondsInMid * 100;
        System.out.println("Percentage of the day that has passed: " + percentOfTime);
       /* int hourPassed = 14;
        int minutePassed = 5;
        int secondPassed = 41;
       int elapsedHour = hourPassed - 1 - hour;
        int elapsedMinute = minutePassed + 60 - minute;
        int elaspedSecond = secondPassed + 60  - second;
        System.out.println("Elapsed time: "+ elapsedHour + ":" + elapsedMinute + ":" + elaspedSecond);*/ 
        
    }
}