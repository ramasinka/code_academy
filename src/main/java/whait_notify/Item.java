package whait_notify;

/**
 * Created by CodeAcademy on 2017.07.18.
 */
public class Item {
    int id;
    String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " name='" + name + '\'';
    }
}
