package onestomanys.service;

import onestomanys.dto.UniversityWithDepartments;
import onestomanys.model.Department;
import onestomanys.model.University;
import onestomanys.repository.DepartmentRepository;
import onestomanys.repository.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {

    private final UniversityRepository universityRepository;
    private final DepartmentRepository departmentRepository;

    public UniversityService(UniversityRepository universityRepository, DepartmentRepository departmentRepository) {
        this.universityRepository = universityRepository;
        this.departmentRepository = departmentRepository;
    }

    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    public University getUniversityById(int id) {
        return universityRepository.findById(id);
    }

    public UniversityWithDepartments getUniversityWithDepartments(int universityId) {
        University university = universityRepository.findById(universityId);
        List<Department> departments = departmentRepository.findByUniversityId(universityId);

        return new UniversityWithDepartments(university, departments);
    }

    public University createUniversity(University university) {
        return universityRepository.save(university);
    }

    public University updateUniversity(int id, University university) {
        return universityRepository.update(id, university);
    }

    public void deleteUniversity(int id) {
        universityRepository.deleteById(id);
    }
}