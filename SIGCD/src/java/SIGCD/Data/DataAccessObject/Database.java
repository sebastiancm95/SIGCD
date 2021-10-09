package SIGCD.Data.DataAccessObject;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Database {

    private static Database theInstance;

    public static Database instance() {
        if (theInstance == null) {
            theInstance = new Database();
        }
        return theInstance;
    }

    public static final String PROPERTIES_FILE_NAME = "/Database.properties";
    Connection connection;

    public Database() {
        connection = this.getConnection();
    }

    public Connection getConnection() {
        try {
            Properties properties = new Properties();
            URL resourceUrl = getClass().getResource(PROPERTIES_FILE_NAME);
            File file = new File(resourceUrl.toURI());
            properties.load(new BufferedInputStream(new FileInputStream(file)));
            String driver = properties.getProperty("database_driver");
            String server = properties.getProperty("database_server");
            String port = properties.getProperty("database_port");
            String user = properties.getProperty("database_user");
            String password = properties.getProperty("database_password");
            String database = properties.getProperty("database_name");
            String URL_conexion = "jdbc:mysql://" + server + ":" + port + "/"
                    + database + "?user=" + user + "&password=" + password + "&serverTimezone=UTC&autoReconnect=true&useSSL=false";
            Class.forName(driver).newInstance();
            return DriverManager.getConnection(URL_conexion);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(-1);
        }
        return null;
    }

    public PreparedStatement prepareStatement(String statement) throws SQLException {
        return connection.prepareStatement(statement);
    }

    public int executeUpdate(PreparedStatement statement) {
        try {
            statement.executeUpdate();
            return statement.getUpdateCount();
        } catch (SQLException ex) {
            return 0;
        }
    }

    public ResultSet executeQuery(PreparedStatement statement) {
        try {
            return statement.executeQuery();
        } catch (SQLException ex) {
        }
        return null;
    }
}
