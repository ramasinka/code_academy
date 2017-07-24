package mysql.jdbc.service;

import mysql.jdbc.data.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by CodeAcademy on 2017.07.24.
 */
public class UserService {
    ConnectionToDatabaseService connectionToDatabaseService;

    public UserService(ConnectionToDatabaseService connectionToDatabaseService) {
        this.connectionToDatabaseService = connectionToDatabaseService;
    }

    public void removeUserById(int id) {
        String sql = "DELETE FROM users WHERE id = '" + id + "'";
        PreparedStatement preparedStatement = connectionToDatabaseService.createPreparedStatement(sql);
        try {
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User getUserById(int id) {
        String sql = "SELECT * FROM users WHERE id ='" + id + "'";
        User user = new User();
        try {
            PreparedStatement preparedStatement = connectionToDatabaseService.createPreparedStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user.setId(resultSet.getInt(1));
                user.setFirst_name(resultSet.getString(2));
                user.setEmail(resultSet.getString(3));
                user.setGender(resultSet.getString(4));
                user.setJob_title(resultSet.getString(5));
                user.setBonus(resultSet.getDouble(6));
                user.setSalary(resultSet.getInt(7));
                user.setCompanyName(resultSet.getString(8));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void insertUserDataToDb(List<User> userList) {
        String sql = "INSERT INTO USERS "
                + "(id, first_name, email, gender, job_title, bonus, salary) VALUES"
                + "(?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connectionToDatabaseService.createPreparedStatement(sql);
        for (User user : userList) {
            try {
                preparedStatement.setInt(1, user.getId());
                preparedStatement.setString(2, user.getFirst_name());
                preparedStatement.setString(3, user.getEmail());
                preparedStatement.setString(4, user.getGender());
                preparedStatement.setString(5, user.getJob_title());
                preparedStatement.setDouble(6, user.getBonus());
                preparedStatement.setInt(7, user.getSalary());
                preparedStatement.setString(8, user.getCompanyName());
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void createUserTable() {
        String sql = "CREATE TABLE USERS " +
                "(id INTEGER not NULL, " +
                " first_name VARCHAR(255), " +
                " email VARCHAR(255), " +
                " gender VARCHAR(255), " +
                " job_title VARCHAR(255), " +
                " bonus DOUBLE PRECISION, " +
                " salary INTEGER, " +
                " PRIMARY KEY ( id ))";

        try {
            PreparedStatement preparedStatement = connectionToDatabaseService.createPreparedStatement(sql);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public void updateUser(String name) {
        Random random = new Random();
        int salary = random.nextInt(10000);
        String sql = "UPDATE codeacademy.users\n" +
                "\tSET salary= '" + salary + "' \n" +
                "\tWHERE first_name = '" + name + "'";
        PreparedStatement preparedStatement = connectionToDatabaseService.createPreparedStatement(sql);
        try {
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> userListByGender(String gender) {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM codeacademy.users WHERE gender = '" + gender + "'";
        PreparedStatement preparedStatement = connectionToDatabaseService.createPreparedStatement(sql);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setFirst_name(resultSet.getString(2));
                user.setEmail(resultSet.getString(3));
                user.setGender(resultSet.getString(4));
                user.setJob_title(resultSet.getString(5));
                user.setBonus(resultSet.getDouble(6));
                user.setSalary(resultSet.getInt(7));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}

