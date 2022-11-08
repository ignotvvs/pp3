public class DrivingLicense {
    
    private String driverName, driverSurname, address; 
    private String postalCode, city, licenseCategory;
    private int yearOfIssue;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        driverName = driverName.substring(0, 1).toUpperCase() + driverName.substring(1).toLowerCase();
        this.driverName = driverName;
    }

    public String getDriverSurname() {
        return driverSurname;
    }

    public void setDriverSurname(String driverSurname) {
        this.driverSurname = driverSurname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    public int getYear() {
        return yearOfIssue;
    }

    public void setYear(int yearOfIssue) {
        if (yearOfIssue >= 1980 && yearOfIssue <= 2022){
            this.yearOfIssue = yearOfIssue;
    }
    }

    public void displayDets() {
        System.out.println("Drivers name: " + this.getDriverName() + "\nDrivers surname: " + this.getDriverSurname()
                    + "\nAddress: " + this.getAddress() + "\nPostal code: " + this.getPostalCode()
                    + "\nCity: " + this.getCity() + "\nLicense category: " + this.getLicenseCategory()
                    + "\nYear  of issue: " +this.getYear());
    }

    public String toString() {
        return "Drivers name: " + this.getDriverName() + "\nDrivers surname: " + this.getDriverSurname()
        + "\nAddress: " + this.getAddress() + "\nPostal code: " + this.getPostalCode()
        + "\nCity: " + this.getCity() + "\nLicense category: " + this.getLicenseCategory()
        + "\nYear  of issue: " +this.getYear();
    }
}