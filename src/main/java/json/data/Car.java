package json.data;

/**
 * Created by CodeAcademy on 2017.07.19.
 */
public class Car {
    String name;
    String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
