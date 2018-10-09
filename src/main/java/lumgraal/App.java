package lumgraal;

import java.sql.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import org.postgresql.Driver;

/**
 * Hello world!
 */
public class App {
    private static Logger logger = LogManager.getLogManager().getLogger("");

    public static void main(String[] args) {

        Logging.setupLogging();

        logger.fine("loading postgresql driver");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        logger.fine("registering postgresql driver");
        Driver driver = new Driver();
        try {
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        logger.info("org.posgresql.Driver.isRegistered() == " + Driver.isRegistered());

        logger.fine("tring to connect to PostgreSQL database");

        String url = "jdbc:postgresql://localhost/postgres?user=postgres&password=postgres";
        try {
            Connection conn = DriverManager.getConnection(url);

            PreparedStatement st = conn.prepareStatement("SELECT 1");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                logger.info("Column 1 returned: " + rs.getString(1));
            }
            rs.close();
            st.close();

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        logger.info("The End.");
    }
}
