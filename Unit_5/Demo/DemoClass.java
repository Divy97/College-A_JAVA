import java.sql.*;

public class DemoClass {
    static final String DB_URL = "jdbc:mysql://localhost:3306/divydb";
    static final String USER = "root";
    static final String PASS = "divy9708";
    static final String QUERY = "SELECT * FROM persons";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {
            while (rs.next()) {
                // Display values
                System.out.print("ID: " + rs.getInt("PersonID"));
                System.out.print(", Age: " + rs.getString("LastName"));
                // System.out.print(", First: " + rs.getString("first"));
                // System.out.println(", Last: " + rs.getString("last"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}