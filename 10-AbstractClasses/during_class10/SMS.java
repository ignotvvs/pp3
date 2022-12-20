package during_class10;

public class SMS extends Message{
    private String phoneNumber;

    public SMS(String text ,String phoneNumber) {
        super(text);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String send() {
        return "Message: " + this.getText() + "\nPhone number: " + phoneNumber;
    }
    
    
}
