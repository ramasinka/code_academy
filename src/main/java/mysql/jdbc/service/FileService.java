package mysql.jdbc.service;

import mysql.jdbc.data.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by CodeAcademy on 2017.07.24.
 */
public class FileService {

    public FileService() {
    }

    public  List<User> getUserListFromFile() {
        String fileName = "src\\main\\java\\mysql\\jdbc\\resource\\DATA.csv";
        Path path = Paths.get(fileName);
        List<User> userList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(Files.newBufferedReader(path));
            Stream<String> stringStream = bufferedReader.lines();

            stringStream
                    .forEach(s -> {
                        String[] split = s.split(",");
                        User user = new User(Integer.parseInt(split[0]),
                                split[1], split[2], split[3], split[4], Double.parseDouble(split[5]), Integer.parseInt(split[6]),split[7]);
                        userList.add(user);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
