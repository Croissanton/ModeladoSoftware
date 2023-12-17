import java.text.SimpleDateFormat;
import java.util.Date;

public class Email {
    private String from;
    private String subject;
    private String date;
    private boolean priority;
    private String text;

    public Email(String from, String subject, String date, boolean priority, String text) {
        this.from = from;
        this.subject = subject;
        this.date = date;
        this.priority = priority;
        this.text = text;
    }

    public long getDate() {
        String dateString = this.date;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date date = dateFormat.parse(dateString);
            return date.getTime();
        } catch (Exception e) {
            return 0;
        }
    }
    public String getFrom() {return from;}
    public String getSubject() {
        return subject;
    }
    public boolean getPriority() {
        return priority;
    }
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "From: " + from + "\n" +
                "Subject: " + subject + "\n" +
                "Date: " + date + "\n" +
                "Priority: " + priority + "\n" +
                "Text: " + text + "\n";
    }
}
