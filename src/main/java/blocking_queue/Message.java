package blocking_queue;

/**
 * Created by CodeAcademy on 2017.07.17.
 */
public class Message {
    String messsage;

    public Message(String s) {
        this.messsage = s;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messsage='" + messsage + '\'' +
                '}';
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }
}
