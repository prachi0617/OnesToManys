package onestomanys.service;

import onestomanys.model.University;
import onestomanys.repository.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {

    private final UniversityRepository universityRepository;

    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    public University getUniversityById(int id) {
        return universityRepository.findById(id);
    }

    public int createUniversity(University university) {
        return universityRepository.save(university);
    }

    public int updateUniversity(int id, University university) {
        return universityRepository.update(id, university);
    }

    public int deleteUniversity(int id) {
        return universityRepository.delete(id);
    }
}