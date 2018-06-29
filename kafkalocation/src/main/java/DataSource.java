import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    private  static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;

    static {
        config.setJdbcUrl("jdbc:oracle:thin:@10.1.40.6:DWSP");
        config.setUsername("itnxw");
        config.setPassword("itnxw2011");
        ds = new HikariDataSource(config);
    }
    private  DataSource (){}

    public  static Connection getConnection() throws SQLException {
        return  ds.getConnection();
    }

    public static List<LocationDimension> fetchData() throws SQLException {

        String SQL_QUERY =" select location_number,location_name, location_class_code from itdba.location_dimension";
        List<LocationDimension> locations = null;

        try(Connection con = DataSource.getConnection();
            PreparedStatement pst = con.prepareStatement(SQL_QUERY);
            ResultSet rs = pst.executeQuery();){

            locations = new ArrayList<>();
            LocationDimension location;

            while(rs.next()){
                location = new LocationDimension();
                location.setLocationNumber(rs.getInt("locationNumber");
                location.setLocationName(rs.getString("locationName"));

            }

        return locations;

        }


    }


}
