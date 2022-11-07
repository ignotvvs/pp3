public class Temperature {
    
    public static double CelsiusToKelvin(double tempr) {
        return tempr+273.15;
    }
    
    public static double KelvinToCelsius(double tempr) {
        return tempr-273.15;
    }
    
    public static double CelsiusToFahrenheit(double tempr) {
        return tempr*1.8+32;
    }

    public static double FahrenheitToCelsius(double tempr) {
        return (tempr-32)*5/9;
    }
    
    public static double FahrenheitToKelvin(double tempr) {
        return (tempr-32)*5/9 + 273.15;
    }
    
    public static double KelvinToFahrenheit(double tempr) {
        return (tempr-273.15)*9/5+32;
    }
    
    public static void main(String[] args) {
        double cToKelvin = CelsiusToKelvin(25);
        double cToFahrenheit = CelsiusToFahrenheit(25);
        System.out.println("Celsius: 25\nFahrenheit: " + cToFahrenheit
                            + "\nKelvin: " + cToKelvin);
        
        double fToCelsius = FahrenheitToCelsius(100);
        double fToKelvin = FahrenheitToKelvin(100);
        System.out.println("\nFahrenheit: 100\nCelsius: " + fToCelsius
                            + "\nKelvin: " + fToKelvin);
         
        double kToCelsius = KelvinToCelsius(0);
        double kToFahrenheit = KelvinToFahrenheit(0);
        System.out.println("\nKelvin: 0\nCelsius: " + kToCelsius
                            + "\nFahrenheit: " + kToFahrenheit);
    }
}