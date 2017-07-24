package mysql.jdbc.service;

import mysql.jdbc.data.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.24.
 */
public class CompanyService {
    ConnectionToDatabaseService connectionToDatabaseService;

    public CompanyService(ConnectionToDatabaseService connectionToDatabaseService) {
        this.connectionToDatabaseService = connectionToDatabaseService;
    }


    public List<User> getUsersByCompanyCountryAndGender(String country, String gender) {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users WHERE gender = '" + gender + "' AND company_name = (SELECT name FROM companies WHERE country = '" + country + "')";
        PreparedStatement preparedStatement = connectionToDatabaseService.createPreparedStatement(sql);
        try {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setFirst_name(resultSet.getString(2));
                user.setEmail(resultSet.getString(3));
                user.setGender(resultSet.getString(4));
                user.setJob_title(resultSet.getString(5));
                user.setBonus(resultSet.getDouble(6));
                user.setSalary(resultSet.getInt(7));
                user.setCompanyName(resultSet.getString(8));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void createCountryTable() {
        String sql = "CREATE TABLE COMPANIES " +
                "(id INTEGER not NULL, " +
                " name VARCHAR(255), " +
                " country VARCHAR(255), " +
                " PRIMARY KEY ( id ))";

        PreparedStatement preparedStatement = connectionToDatabaseService.createPreparedStatement(sql);
        try {
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
