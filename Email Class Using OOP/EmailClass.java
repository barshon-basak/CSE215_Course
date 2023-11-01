
package javaapplication60;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Email {
   private String from;
    private String to;
    private String message;
    private String date;
    private String time;

    public Email(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        Date now = new Date();
        this.date = dateFormat.format(now);
        this.time = timeFormat.format(now);
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
