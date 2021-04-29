package hu.nive.ujratervezes.kepesitovizsga.jurassicPark;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private MariaDbDataSource dataSource = new MariaDbDataSource();

    public JurassicPark(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<String> checkOverpopulation() {
        List<String> result = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT `breed` from dinosaur  WHERE `expected`<`actual` ORDER BY `breed`");
        ) {

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    result.add(rs.getString("breed"));

                }
                return result;

            }
        } catch (SQLException e) {
            throw new IllegalArgumentException("Cannot insert", e);
        }
    }
    //   return null;
}


