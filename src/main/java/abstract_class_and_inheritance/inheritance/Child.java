package abstract_class_and_inheritance.inheritance;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class Child extends Parent {

    @Override
    public int sum(int firstValue, int secondValue) {
        System.out.println("child value");
        return firstValue + secondValue;
    }

    public int secondSum(int first, int second){
        System.out.println("parent");
        return super.sum(first, second);
    }
}
