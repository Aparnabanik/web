package com.example.demo.service;

import com.example.demo.model.Faculty;

import java.util.List;

public interface FacultyService {
    public List<Faculty> getAllFaculty();
    public Faculty getFacultyById(String facultyId);
    public void saveOrUpdate(Faculty faculty);
    public void removeFaculty(String facultyId);
}