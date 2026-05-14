package onestomanys.service;

import onestomanys.model.Department;
import onestomanys.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();

    }

    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id);
    }

    public List<Department> getDepartmentsByUniversityId(int universityId) {
        return departmentRepository.findByUniversityId(universityId);
    }

    public int createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public int updateDepartment(int id, Department department) {
        return departmentRepository.update(id, department);
    }

    public int deleteDepartment(int id) {
        return departmentRepository.delete(id);
    }
}