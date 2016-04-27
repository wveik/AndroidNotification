package application.my.ru.notification.Models;

/**
 * Created by kataev2 on 27.04.2016.
 */
public class NotificationFromWeb {

    private int NT_KEY;
    private int NT_TOPIC_KEY;
    private String NT_TITLE;
    private String NT_DESCRIPTION;
    private String NT_CREATE_DATE;

    public NotificationFromWeb(int NT_KEY, int NT_TOPIC_KEY, String NT_TITLE, String NT_DESCRIPTION, String NT_CREATE_DATE) {
        this.setNT_KEY(NT_KEY);
        this.setNT_TOPIC_KEY(NT_TOPIC_KEY);
        this.setNT_TITLE(NT_TITLE);
        this.setNT_DESCRIPTION(NT_DESCRIPTION);
        this.setNT_CREATE_DATE(NT_CREATE_DATE);
    }

    public int getNT_KEY() {
        return NT_KEY;
    }

    public void setNT_KEY(int NT_KEY) {
        this.NT_KEY = NT_KEY;
    }

    public int getNT_TOPIC_KEY() {
        return NT_TOPIC_KEY;
    }

    public void setNT_TOPIC_KEY(int NT_TOPIC_KEY) {
        this.NT_TOPIC_KEY = NT_TOPIC_KEY;
    }

    public String getNT_TITLE() {
        return NT_TITLE;
    }

    public void setNT_TITLE(String NT_TITLE) {
        this.NT_TITLE = NT_TITLE;
    }

    public String getNT_DESCRIPTION() {
        return NT_DESCRIPTION;
    }

    public void setNT_DESCRIPTION(String NT_DESCRIPTION) {
        this.NT_DESCRIPTION = NT_DESCRIPTION;
    }

    public String getNT_CREATE_DATE() {
        return NT_CREATE_DATE;
    }

    public void setNT_CREATE_DATE(String NT_CREATE_DATE) {
        this.NT_CREATE_DATE = NT_CREATE_DATE;
    }
}
