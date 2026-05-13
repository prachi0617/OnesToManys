package onestomanys.repository;

import onestomanys.model.University;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UniversityRepository {

    private final JdbcTemplate jdbcTemplate;

    public UniversityRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<University> findAll() {
        String sql = "SELECT * FROM universities";

        return jdbcTemplate.query(sql, (rs, rowNum) -> new University(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("city"),
                rs.getString("state"),
                rs.getInt("founded_year")));
    }

    public University findById(int id) {
        String sql = "SELECT * FROM universities WHERE id = ?";

        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new University(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("city"),
                rs.getString("state"),
                rs.getInt("founded_year")), id);
    }

    public int save(University university) {
        String sql = "INSERT INTO universities (name, city, state, founded_year) VALUES (?, ?, ?, ?)";

        return jdbcTemplate.update(
                sql,
                university.getName(),
                university.getCity(),
                university.getState(),
                university.getFoundedYear());
    }

    public int update(int id, University university) {
        String sql = "UPDATE universities SET name = ?, city = ?, state = ?, founded_year = ? WHERE id = ?";

        return jdbcTemplate.update(
                sql,
                university.getName(),
                university.getCity(),
                university.getState(),
                university.getFoundedYear(),
                id);
    }

    public int delete(int id) {
        String sql = "DELETE FROM universities WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}