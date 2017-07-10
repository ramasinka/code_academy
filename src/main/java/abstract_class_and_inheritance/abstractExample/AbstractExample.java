package abstract_class_and_inheritance.abstractExample;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public abstract class AbstractExample {

    String name;

    public AbstractExample(String name) {
        this.name = name;
    }

    public AbstractExample() {
    }

    abstract void intro();

    public void getInfo() {
    }
}
