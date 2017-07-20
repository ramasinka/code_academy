package json.data;

/**
 * Created by CodeAcademy on 2017.07.19.
 */
public class Animals {
    String name;
    String type;

    public Animals(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Animals() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
