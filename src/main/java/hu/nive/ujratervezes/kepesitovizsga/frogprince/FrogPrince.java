package hu.nive.ujratervezes.kepesitovizsga.frogprince;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class FrogPrince {
    public Set<PlayerOfTale> getPlayersOfTale(MariaDbDataSource dataSource, Tale tale) {

        try (Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("select player_name, age, tale from tales where tale = ?")){
            ps.setString(1, tale.name());
            return getResult(ps);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot query", sqlException);
        }
    }

    private Set<PlayerOfTale> getResult(PreparedStatement ps) throws SQLException {
        Set<PlayerOfTale> result = new HashSet<>();
        try (ResultSet rs = ps.executeQuery()){
            while (rs.next()) {
                result.add(new PlayerOfTale(rs.getString("player_name"), rs.getInt("age"), Tale.valueOf(rs.getString("tale"))));
            }
        }
        return result;
    }
}
