package mysql.jdbc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by CodeAcademy on 2017.07.24.
 */
public class ConnectionToDatabaseService {
    private String DB_DRIVER = "org.postgresql.Driver";
    private String DB_CONNECTION = "jdbc:postgresql://localhost:5432/postgres?currentSchema=codeacademy";
    private String DB_USER = "postgres";
    private String DB_PASSWORD = "codeacademy";

    public ConnectionToDatabaseService(String DB_DRIVER, String DB_CONNECTION, String DB_USER, String DB_PASSWORD) {
        this.DB_DRIVER = DB_DRIVER;
        this.DB_CONNECTION = DB_CONNECTION;
        this.DB_USER = DB_USER;
        this.DB_PASSWORD = DB_PASSWORD;
    }

    public ConnectionToDatabaseService() {
    }

    public Connection connectToMysql() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }
        try {
            dbConnection = DriverManager
                    .getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public PreparedStatement createPreparedStatement(String sql) {
        try {
            Connection connection = connectToMysql();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            return preparedStatement;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}