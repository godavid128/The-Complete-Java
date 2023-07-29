package L9_Learning_JDBC;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbs:mysql://127.0.0.1:3306/employees_database";
        // Establish Connection Object
        try {
            Connection conn = DriverManager.getConnection("root");

            // create a statement object to send to the database
            Statement statement = conn.createStatement();

            // Execute the statement object
            ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

            // Process the result
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
