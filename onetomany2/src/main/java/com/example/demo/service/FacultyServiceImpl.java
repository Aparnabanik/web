package com.example.demo.service;

import com.example.demo.Repository.FacultyRepo;
import com.example.demo.model.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {
    @Autowired
    private FacultyRepo facultyRepo;
    @Override public List<Faculty> getAllFaculty()
    { return facultyRepo.findAll();
    }
    @Override public Faculty getFacultyById(String facultyId) {
        return facultyRepo.getOne(facultyId);
    }
    @Override public void saveOrUpdate(Faculty faculty) {
        facultyRepo.save(faculty);
    }
    @Override public void removeFaculty(String facultyId) {
        facultyRepo.deleteById(facultyId);
    }
}
