package abstract_class_and_inheritance;

import abstract_class_and_inheritance.data.Figure;
import abstract_class_and_inheritance.data.Person;
import abstract_class_and_inheritance.inheritance.Child;
import abstract_class_and_inheritance.inheritance.FigureUtil;
import abstract_class_and_inheritance.inheritance.InheritanceChild;
import abstract_class_and_inheritance.service.InputValueService;
import abstract_class_and_inheritance.service.InitialMethodsService;
import abstract_class_and_inheritance.service.PersonService;

import java.util.List;
import java.util.Scanner;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class Main {
    public static void main(String[] args) {
//        thisSyntaxWithList();
//        calculateFactorial(10);
//        thisExample();
//    calculateFigure();
//    displayArguments("aaa", "ssss", "dddd", "qqqq");
        superInitial();
    }

    public static void thisSyntaxWithList() {
        //Constructors and setters/getters

        PersonService personService = new PersonService();
        List<Person> persons = personService.getPersons();

        Person person = new Person();
        person.createPerson(1, "test", "123");
        personService.addPerson(person);

        Person firstPerson = new Person();
        firstPerson.setCode("1221");
        firstPerson.setId(1);
        firstPerson.setName("test2");
        personService.addPerson(firstPerson);

        Person secondPerson = new Person(1, "test2", "sss");
        personService.addPerson(secondPerson);

        System.out.println(persons);

        List<Person> samePersonsList = personService.getPersons();
        System.out.println(samePersonsList);

        Person personToDisplay = samePersonsList.get(0);
        System.out.println("Id: " + personToDisplay.getId());

        boolean checkValue = personService.findPerson("test2");
        System.out.println(checkValue);
    }

    //initial calculate factorial
    public static void calculateFactorial(int number) {
        int factorialValue = 1;
        for (int i = 1; i < number; i++) {
            factorialValue += factorialValue * i;
        }
        System.out.println(factorialValue);
    }

    //initial "this" methods
    public static void thisExample() {
        InitialMethodsService initialMethodsService = new InitialMethodsService();
        initialMethodsService.initialMethods(new InputValueService());
    }

    //calculate figure perimeter and area
    public static void calculateFigure() {
        FigureUtil figureUtil = new FigureUtil();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type: ");
        String type = scanner.next();

        System.out.println("Length: ");
        double length = Double.parseDouble(scanner.next());

        System.out.println("Width: ");
        double width = Double.parseDouble(scanner.next());

        Figure figure = new Figure(length, width, type);
        double perimeter = figureUtil.getPerimeter(figure);
        System.out.println("perimeter: " + perimeter);

        double area = figureUtil.getArea(figure);
        System.out.println("area: " + area);
    }

    //Arguments in parameter
    public static void displayArguments(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void superInitial() {
        InheritanceChild inheritanceChild = new InheritanceChild();
        inheritanceChild.display();

        Child child = new Child();
        child.sum(1, 2);

        child.secondSum(7, 3);
    }

}
