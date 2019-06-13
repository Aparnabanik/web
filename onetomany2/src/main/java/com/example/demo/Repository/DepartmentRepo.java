package com.example.demo.Repository;

import com.example.demo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,String> {
    public Department findDepartmentByFacultyFacultyCode(String facultyId);
}
