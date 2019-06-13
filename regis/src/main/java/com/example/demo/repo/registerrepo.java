package com.example.demo.repo;

import com.example.demo.model.register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface registerrepo extends JpaRepository<register,String> {
}
