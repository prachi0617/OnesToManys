package onestomanys.controller;

import onestomanys.dto.UniversityWithDepartments;
import onestomanys.model.Department;
import onestomanys.model.University;
import onestomanys.service.DepartmentService;
import onestomanys.service.UniversityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/universities")
public class UniversityController {

    private final UniversityService universityService;
    private final DepartmentService departmentService;

    public UniversityController(UniversityService universityService, DepartmentService departmentService) {
        this.universityService = universityService;
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<University> getAllUniversities() {
        return universityService.getAllUniversities();
    }

    @GetMapping("/{id}")
    public University getUniversityById(@PathVariable int id) {
        return universityService.getUniversityById(id);
    }

    @GetMapping("/{id}/departments")
    public List<Department> getDepartmentsByUniversity(@PathVariable int id) {
        return departmentService.getDepartmentsByUniversityId(id);
    }

    @GetMapping("/{id}/details")
    public UniversityWithDepartments getUniversityWithDepartments(@PathVariable int id) {
        return universityService.getUniversityWithDepartments(id);
    }

    @PostMapping
    public String createUniversity(@RequestBody University university) {
        universityService.createUniversity(university);
        return "University created successfully";
    }

    @PostMapping("/{id}/departments")
    public String createDepartmentForUniversity(@PathVariable int id, @RequestBody Department department) {
        department.setUniversityId(id);
        departmentService.createDepartment(department);
        return "Department created for university successfully";
    }

    @PutMapping("/{id}")
    public String updateUniversity(@PathVariable int id, @RequestBody University university) {
        universityService.updateUniversity(id, university);
        return "University updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteUniversity(@PathVariable int id) {
        universityService.deleteUniversity(id);
        return "University deleted successfully";
    }
}