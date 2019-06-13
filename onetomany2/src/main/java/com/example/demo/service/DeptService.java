package com.example.demo.service;

import com.example.demo.model.Department;

import java.util.List;

public interface DeptService {
    public List<Department> getAllDepartment();
    //public List<Department> getDepartmentByFaculty(String facultyId);
public Department getDepartmentById(String departmentId);
public void saveOrUpdate(Department department);
public void removeDepartment(String departmentId);
}
