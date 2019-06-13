package com.example.demo.repo;

import com.example.demo.model.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo, Integer> {

}
