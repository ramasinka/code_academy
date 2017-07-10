package abstract_class_and_inheritance.inheritance;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class Child1 extends Parent1 {

    public Child1() {
        super(null);
    }

    public Child1(String text) {
        super(text);
        this.parseText();
    }

    public void parseText() {
        char[] array = super.text.toCharArray();
        char[] parsedArray = new char[array.length/2+1];
        for (int i = 0; i < array.length; i = +2) {
            parsedArray[i] = array[i];

        }
        System.out.println(parsedArray);
    }
}
