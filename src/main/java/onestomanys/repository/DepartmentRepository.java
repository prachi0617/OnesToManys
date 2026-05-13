package onestomanys.repository;

import onestomanys.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepository {

    private final JdbcTemplate jdbcTemplate;

    public DepartmentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Department> findAll() {
        String sql = "SELECT * FROM departments";

        return jdbcTemplate.query(sql, (rs, rowNum) -> new Department(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("building"),
                rs.getDouble("budget"),
                rs.getInt("university_id")));
    }

    public Department findById(int id) {
        String sql = "SELECT * FROM departments WHERE id = ?";

        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new Department(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("building"),
                rs.getDouble("budget"),
                rs.getInt("university_id")), id);
    }

    public int save(Department department) {
        String sql = "INSERT INTO departments (name, building, budget, university_id) VALUES (?, ?, ?, ?)";

        return jdbcTemplate.update(
                sql,
                department.getName(),
                department.getBuilding(),
                department.getBudget(),
                department.getUniversityId());
    }

    public int update(int id, Department department) {
        String sql = "UPDATE departments SET name = ?, building = ?, budget = ?, university_id = ? WHERE id = ?";

        return jdbcTemplate.update(
                sql,
                department.getName(),
                department.getBuilding(),
                department.getBudget(),
                department.getUniversityId(),
                id);
    }

    public int delete(int id) {
        String sql = "DELETE FROM departments WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}