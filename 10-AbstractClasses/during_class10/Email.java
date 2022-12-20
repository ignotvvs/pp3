package during_class10;

public class Email extends Message{
    private String subject, recipient;

    public Email(String text, String subject, String recipient) {
        super(text);
        this.subject = subject;
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public String send() {
        return "Message: " + this.getText() + "\nSubject: " + subject + "\nRecipient: " + recipient;
    }
}
