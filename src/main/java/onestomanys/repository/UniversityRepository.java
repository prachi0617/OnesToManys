package onestomanys.repository;

import onestomanys.model.University;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UniversityRepository {

    private final JdbcTemplate jdbcTemplate;

    public UniversityRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<University> universityRowMapper = (rs, rowNum) -> new University(
            rs.getInt("university_id"),
            rs.getString("university_code"),
            rs.getString("university_name"),
            rs.getString("country"),
            rs.getString("state_province"),
            rs.getString("city"),
            rs.getString("address"),
            rs.getString("email"),
            rs.getString("phone"),
            rs.getString("website"),
            rs.getInt("established_year"),
            rs.getString("university_type"));

    public List<University> findAll() {
        String sql = "SELECT * FROM universities";
        return jdbcTemplate.query(sql, universityRowMapper);
    }

    public University findById(Integer id) {
        String sql = "SELECT * FROM universities WHERE university_id = ?";
        return jdbcTemplate.queryForObject(sql, universityRowMapper, id);
    }

    public University save(University university) {
        String sql = """
                INSERT INTO universities (
                    university_code,
                    university_name,
                    country,
                    state_province,
                    city,
                    address,
                    email,
                    phone,
                    website,
                    established_year,
                    university_type
                )
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;

        jdbcTemplate.update(
                sql,
                university.getUniversityCode(),
                university.getUniversityName(),
                university.getCountry(),
                university.getStateProvince(),
                university.getCity(),
                university.getAddress(),
                university.getEmail(),
                university.getPhone(),
                university.getWebsite(),
                university.getEstablishedYear(),
                university.getUniversityType());

        Integer newId = jdbcTemplate.queryForObject(
                "SELECT last_insert_rowid()",
                Integer.class);

        return findById(newId);
    }

    public University update(Integer id, University university) {
        String sql = """
                UPDATE universities
                SET university_code = ?,
                    university_name = ?,
                    country = ?,
                    state_province = ?,
                    city = ?,
                    address = ?,
                    email = ?,
                    phone = ?,
                    website = ?,
                    established_year = ?,
                    university_type = ?
                WHERE university_id = ?
                """;

        jdbcTemplate.update(
                sql,
                university.getUniversityCode(),
                university.getUniversityName(),
                university.getCountry(),
                university.getStateProvince(),
                university.getCity(),
                university.getAddress(),
                university.getEmail(),
                university.getPhone(),
                university.getWebsite(),
                university.getEstablishedYear(),
                university.getUniversityType(),
                id);

        return findById(id);
    }

    public void deleteById(Integer id) {
        String sql = "DELETE FROM universities WHERE university_id = ?";
        jdbcTemplate.update(sql, id);
    }

    public boolean existsById(Integer id) {
        String sql = "SELECT COUNT(*) FROM universities WHERE university_id = ?";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, id);
        return count != null && count > 0;
    }
}