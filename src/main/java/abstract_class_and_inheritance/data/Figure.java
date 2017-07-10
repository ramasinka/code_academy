package abstract_class_and_inheritance.data;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class Figure {
    double lenght;
    double width;
    private String type;

    public Figure(double lenght,double width, String type) {
        this.lenght = lenght;
        this.width = width;
        this.type = type;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
