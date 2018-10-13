package lumgraal;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.postgresql.ds.PGSimpleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Hello world!
 */
public class App {
    private static Logger logger = LogManager.getLogManager().getLogger("");

    public static void main(String[] args) {

        Logging.setupLogging();

        String url = "jdbc:postgresql://localhost/postgres?user=postgres&password=postgres";
        PGSimpleDataSource psqlDs = new PGSimpleDataSource();
        psqlDs.setUrl(url);

        HikariConfig config = new HikariConfig();
        config.setDataSource(psqlDs);

        logger.fine("Trying to connect to PostgreSQL database " + url);
        HikariDataSource ds = new HikariDataSource(config);

        try {
            Connection conn = ds.getConnection();

            PreparedStatement st = conn.prepareStatement("SELECT 1");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                logger.info("Column 1 returned: " + rs.getString(1));
            }
            rs.close();
            st.close();

            conn.close();

            ds.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        logger.info("The End.");
    }
}
