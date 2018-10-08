//package lumgraal;
//
//import com.impossibl.postgres.jdbc.PGDataSource;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
///**
// * Hello world!
// */
//public class AppNg {
//    public static void main(String[] args) {
//
//        try {
//            PGDataSource dataSource = new PGDataSource();
//            dataSource.setHost("localhost");
//            dataSource.setPort(5432);
//            dataSource.setDatabase("postgres");
//            dataSource.setUser("postgres");
//            dataSource.setPassword("postgres");
//
//            Connection conn = null;
//
//            conn = dataSource.getConnection();
//            PreparedStatement st = conn.prepareStatement("SELECT 1");
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                System.out.print("Column 1 returned ");
//                System.out.println(rs.getString(1));
//            }
//            rs.close();
//            st.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("The End.");
//    }
//}
