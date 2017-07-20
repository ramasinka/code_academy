package lambda_streams;

import lambda_streams.data.ChangedPerson;
import lambda_streams.data.Person;
import lambda_streams.file_service.FileReaderService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by CodeAcademy on 2017.07.20.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<ChangedPerson> nameList = new ArrayList<>();
        nameList = readFileWithBufferedReaderAndCollectToStream()
                .values()
                .stream()
                .filter(changedPerson -> changedPerson.getName().startsWith("A"))
                .filter(changedPerson -> changedPerson.getGender().equals("Female"))
                .filter(changedPerson -> (changedPerson.getEmail().endsWith("com")))
                .collect(Collectors.toList());

        nameList.forEach(changedPerson -> System.out.println(changedPerson.getName() + " " + changedPerson.getEmail() + " " + changedPerson.getGender()));
    }

    private static Map<Integer, ChangedPerson> readFileWithBufferedReaderAndCollectToStream() {
        String fileName = "src\\main\\java\\lambda_streams\\MOCKDATA.csv";
        Path path = Paths.get(fileName);
        List<String> list = new ArrayList<>();
        Map<Integer, ChangedPerson> map = new HashMap<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(Files.newBufferedReader(path));
            list = bufferedReader.lines()
                    .collect(Collectors.toList());
            list
                    .stream()
                    .forEach(s -> {
                        String[] split = s.split(",");
                        for (int i = 0; i < split.length; i++) {

                            if (!s.startsWith("id")) {

                            }
                            String ip = split[5];
                            for (int j = 0; j < 10; j++) {
                                ip = ip.replace((char) (48 + j), '*');
                            }
                            map.put(Integer.parseInt(split[0]), new ChangedPerson(Integer.parseInt(split[0]), split[1] + split[2], split[3], split[4], ip));
                        }
                    });


          /*  map.forEach((integer, changedPerson) -> {
                if(changedPerson.getGender().toLowerCase().equals("male")){
                    System.out.println(changedPerson);
                }
            });*/
          /*  map
                    .forEach((integer, person) -> {
                        if (person.getName().length() <= 3) {
                            System.out.println("ID: " + integer + " Name: " + person.getName());
                        }
                    });

            map
                    .entrySet()
                    .stream()
                    .forEach(person -> System.out.println(person.getValue().getEmail()));*/

        } catch (
                IOException e)

        {
            e.printStackTrace();
        }

        return map;
    }

    private static void iterateListFromFileWithStream() {
        String fileName = "src\\main\\java\\lambda_streams\\STREAMDATA.csv";
        Path path = Paths.get(fileName);

        List<String> list = new ArrayList<>();
        try {
            Stream<String> stream = Files.lines(path);

            list = stream
                    .collect(Collectors.toList());

            List<String> listOfStrings = list
                    .stream()
                    .filter(s -> s.toLowerCase().indexOf("bert") > 0)
                    .sorted()
                    .collect(Collectors.toList());

            listOfStrings.forEach(s -> System.out.println(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void streamRealization() {
        List<Integer> strings = Arrays.asList(1, 2, 3);
        long result1 = strings.stream()
                .filter(integer -> integer != 1)
                .count();

        System.out.println(result1);

        strings.forEach(integer -> {
            integer = integer * integer * integer;
            System.out.print(integer + " ");
        });
    }

    private static void findEqualsInList() {
        List<String> lines = Arrays.asList("spring", "node", "mkyong");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node
    }

    private static void iterateInListAndUseStream() {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

    private static void getDataFromMapAndUsingStream() throws FileNotFoundException {
        FileReaderService fileReaderService = new FileReaderService();
        List<Person> personList = fileReaderService.getPersons();

        List<Person> collected = personList.stream()
                .filter(person -> person.getId() > 10 && person.getId() < 15)
                .collect(Collectors.toList());

        collected.stream()
                .forEach(person -> System.out.println(person.getId() + person.getName()));

        System.out.println(collected);

        Optional<Person> first = collected.stream()
                .findFirst();
        System.out.println(first);
    }

    private static void iterateMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "first");
        map.put(2, "aaa");
        map.put(3, "bbb");
        map.put(4, "ccc");

        map.forEach((integer, s) -> {
            System.out.println(integer + s);
        });
    }

    private static void findIndexInList() {
        List<String> list = Arrays.asList("spring", "node", "mkyong", "nOde");

        List<String> resultList = list.stream()
                .filter(line -> line.toLowerCase().indexOf("o") > 0)
                .collect(Collectors.toList());

        resultList.forEach(System.out::println);
    }
}
