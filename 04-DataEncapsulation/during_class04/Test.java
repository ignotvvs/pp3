public class Test {
    public static void main(String[] args) {
        DrivingLicense d1 = new DrivingLicense();
        d1.setDriverName("Robert");
        d1.setDriverSurname("Linder");
        d1.setAddress("Baker St. 342");
        d1.setCity("London");
        d1.setPostalCode("34-153");
        d1.setYear(2012);
        d1.setLicenseCategory("A2");
        //d1.displayDets();
        System.out.println(d1.toString());
    }
}
