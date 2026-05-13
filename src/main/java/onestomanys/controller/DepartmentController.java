package onestomanys.controller;

import onestomanys.model.Department;
import onestomanys.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable int id) {
        return departmentService.getDepartmentById(id);
    }

    @PostMapping
    public String createDepartment(@RequestBody Department department) {
        departmentService.createDepartment(department);
        return "Department created successfully";
    }

    @PutMapping("/{id}")
    public String updateDepartment(@PathVariable int id, @RequestBody Department department) {
        departmentService.updateDepartment(id, department);
        return "Department updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable int id) {
        departmentService.deleteDepartment(id);
        return "Department deleted successfully";
    }
}