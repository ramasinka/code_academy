package json.json_mapper;

import json.data.Address;
import json.data.Animals;
import json.data.Car;
import json.data.User;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by CodeAcademy on 2017.07.19.
 */
public class JsonObjectMapper {
    private static final String PATH = "C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\resources\\";
    private static String fileName = "OBJECT_MAPPER.json";

    public static void main(String[] args) throws IOException {
        List<Animals> animals = createAnimals();
        Map<Integer, Car> carMap = createCars();

        User user = createUser();
        user.setAnimals(animals);
        user.setCars(carMap);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new FileWriter(PATH + fileName), user);

        User readUser = objectMapper.readValue(new File(PATH + fileName), User.class);
        System.out.println("Cars:" + readUser.getCars());
        System.out.println("Animals:" + readUser.getAnimals());
        System.out.println("User:" + readUser.getId() + readUser.getName());

    }

    private static Map<Integer, Car> createCars() {
        Map<Integer, Car> carMap = new HashMap<>();
        Car toyota = new Car("Toyota", "Red");
        Car audi = new Car("Audi", "White");
        Car bmw = new Car("Bmw", "Black");

        carMap.put(1, toyota);
        carMap.put(2, audi);
        carMap.put(3, bmw);
        return carMap;
    }

    private static List<Animals> createAnimals() {
        List<Animals> animals = new ArrayList<>();
        animals.add(new Animals("Ciuhuahua", "Dog"));
        animals.add(new Animals("Moooooowww", "Cat"));
        return animals;
    }

    private static User createUser() {
        User user = new User();
        user.setId(1);
        user.setAge(23);
        user.setEmail("test@test.test");
        user.setName("Petras");
        user.setAddress(new Address("Kaunas", "Savanoriai", "5"));
        return user;
    }
}
