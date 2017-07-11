package streams;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by CodeAcademy on 2017.07.11.
 */
public class MainSerialization {
    public static void main(String[] args) {
        PersonSerializable personSerializable = new PersonSerializable();
        personSerializable.setId(1);
        personSerializable.setName("Test");
        personSerializable.setSurname("Test1");
        personSerializable.setAge(20);
        personSerializable.setGender(PersonSerializable.Gender.FEMALE);
        writeSerializableObject(personSerializable);
        PersonSerializable personSerializable1 = deserializeObject();
        System.out.println(personSerializable1);
    }

    private static PersonSerializable deserializeObject() {
        PersonSerializable personSerializable = null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\java\\streams\\SERIALIZABLEDOBJECT.txt"));
            personSerializable = (PersonSerializable) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return personSerializable;
    }

    private static void writeSerializableObject(PersonSerializable personSerializable) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\CodeAcademy\\IdeaProjects\\codeacademy\\src\\main\\java\\streams\\SERIALIZABLEDOBJECT.txt")));
            objectOutputStream.writeObject(personSerializable);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
