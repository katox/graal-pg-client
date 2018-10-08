package lumgraal;

import java.sql.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:postgresql://localhost/postgres?user=postgres&password=postgres";
        try {
            Connection conn = DriverManager.getConnection(url);

            PreparedStatement st = conn.prepareStatement("SELECT 1");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(1));
            }
            rs.close();
            st.close();

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("The End.");
    }
}
