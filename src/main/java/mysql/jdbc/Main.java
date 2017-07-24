package mysql.jdbc;

import mysql.jdbc.data.User;
import mysql.jdbc.service.CompanyService;
import mysql.jdbc.service.ConnectionToDatabaseService;
import mysql.jdbc.service.UserService;

import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.24.
 */
public class Main {
    public static void main(String[] args) {
        String DB_DRIVER = "org.postgresql.Driver";
        String DB_CONNECTION = "jdbc:postgresql://localhost:5432/postgres?currentSchema=codeacademy";
        String DB_USER = "postgres";
        String DB_PASSWORD = "codeacademy";

        ConnectionToDatabaseService connectionToDatabaseService = new ConnectionToDatabaseService(DB_DRIVER, DB_CONNECTION, DB_USER, DB_PASSWORD);
        UserService userService = new UserService(connectionToDatabaseService);

        userService.updateUser("Karlyn");
        userService.removeUserById(2);

      /*  List<User> maleUsers = userService.userListByGender("Male");
        System.out.println("Male Users: " + maleUsers);
        List<User> femaleUsers = userService.userListByGender("Female");
        System.out.println("Female Users: " + femaleUsers);*/

        CompanyService companyService = new CompanyService(connectionToDatabaseService);
        List<User> usersByCompanyCountryAndGender = companyService.getUsersByCompanyCountryAndGender("USA", "Female");

        usersByCompanyCountryAndGender.forEach(user -> System.out.println(user.getCompanyName()));

    }
}
