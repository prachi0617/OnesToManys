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
                rs.getInt("department_id"),
                rs.getString("department_name"),
                rs.getString("department_code"),
                rs.getInt("university_id"),
                rs.getString("head_of_department"),
                rs.getString("department_email"),
                rs.getString("department_phone"),
                rs.getString("building_name"),
                rs.getInt("total_faculty"),
                rs.getInt("total_students")));
    }

    public Department findById(int id) {
        String sql = "SELECT * FROM departments WHERE department_id = ?";

        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new Department(
                rs.getInt("department_id"),
                rs.getString("department_name"),
                rs.getString("department_code"),
                rs.getInt("university_id"),
                rs.getString("head_of_department"),
                rs.getString("department_email"),
                rs.getString("department_phone"),
                rs.getString("building_name"),
                rs.getInt("total_faculty"),
                rs.getInt("total_students")), id);
    }

    public List<Department> findByUniversityId(int universityId) {
        String sql = "SELECT * FROM departments WHERE university_id = ?";

        return jdbcTemplate.query(sql, (rs, rowNum) -> new Department(
                rs.getInt("department_id"),
                rs.getString("department_name"),
                rs.getString("department_code"),
                rs.getInt("university_id"),
                rs.getString("head_of_department"),
                rs.getString("department_email"),
                rs.getString("department_phone"),
                rs.getString("building_name"),
                rs.getInt("total_faculty"),
                rs.getInt("total_students")), universityId);
    }

    public int save(Department department) {
        String sql = """
                INSERT INTO departments
                (department_name, department_code, university_id, head_of_department, department_email, department_phone, building_name, total_faculty, total_students)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;

        return jdbcTemplate.update(
                sql,
                department.getDepartmentName(),
                department.getDepartmentCode(),
                department.getUniversityId(),
                department.getHeadOfDepartment(),
                department.getDepartmentEmail(),
                department.getDepartmentPhone(),
                department.getBuildingName(),
                department.getTotalFaculty(),
                department.getTotalStudents());
    }

    public int update(int id, Department department) {
        String sql = """
                UPDATE departments
                SET department_name = ?, department_code = ?, university_id = ?, head_of_department = ?,
                    department_email = ?, department_phone = ?, building_name = ?, total_faculty = ?, total_students = ?
                WHERE department_id = ?
                """;

        return jdbcTemplate.update(
                sql,
                department.getDepartmentName(),
                department.getDepartmentCode(),
                department.getUniversityId(),
                department.getHeadOfDepartment(),
                department.getDepartmentEmail(),
                department.getDepartmentPhone(),
                department.getBuildingName(),
                department.getTotalFaculty(),
                department.getTotalStudents(),
                id);
    }

    public int delete(int id) {
        String sql = "DELETE FROM departments WHERE department_id = ?";
        return jdbcTemplate.update(sql, id);
    }
}