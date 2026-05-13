package onestomanys.controller;

import onestomanys.model.University;
import onestomanys.service.UniversityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {

    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @GetMapping
    public List<University> getAllUniversities() {
        return universityService.getAllUniversities();
    }

    @GetMapping("/{id}")
    public University getUniversityById(@PathVariable int id) {
        return universityService.getUniversityById(id);
    }

    @PostMapping
    public String createUniversity(@RequestBody University university) {
        universityService.createUniversity(university);
        return "University created successfully";
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