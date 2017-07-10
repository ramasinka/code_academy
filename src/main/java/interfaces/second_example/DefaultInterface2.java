package interfaces.second_example;

/**
 * Created by CodeAcademy on 2017.07.10.
 */
public interface DefaultInterface2 {
    void print();

    default int kvadratu(int x) {
        return x * x;
    }
}
