package onestomanys.dto;

import onestomanys.model.Department;
import onestomanys.model.University;

import java.util.List;

public class UniversityWithDepartments {

    private University university;
    private List<Department> departments;

    public UniversityWithDepartments() {
    }

    public UniversityWithDepartments(University university, List<Department> departments) {
        this.university = university;
        this.departments = departments;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
