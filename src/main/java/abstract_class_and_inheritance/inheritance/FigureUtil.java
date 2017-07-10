package abstract_class_and_inheritance.inheritance;

import abstract_class_and_inheritance.data.Figure;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class FigureUtil {

    public double getArea(Figure figure) {
        String type = figure.getType();
        double length = figure.getLenght();

        if (type.equals("triangle")) {
            return Math.pow(length, 2);
        }
        if (type.equals("square")) {
            return Math.pow(length, 2);
        }
        if (type.equals("rectangle")) {
            return Math.pow(length, 2);
        }

        return length;
    }

    public double getPerimeter(Figure figure) {
        String type = figure.getType();
        double length = figure.getLenght();

        if (type.equals("triangle")) {
            return 3 * length;
        }
        if (type.equals("square")) {
            return 4 * length;
        }
        if (type.equals("rectangle")) {
            return 4 * length;
        }
        return length;
    }
}
