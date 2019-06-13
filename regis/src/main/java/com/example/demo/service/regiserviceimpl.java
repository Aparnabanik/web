package com.example.demo.service;

import com.example.demo.model.register;
import com.example.demo.repo.registerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class regiserviceimpl implements registerservice{
    @Autowired
    registerrepo reRepo;

    @Override
    public List<register> showall()
    {
        return reRepo.findAll();
    }
    @Override
    public register getregisterbyid(String email)
    {
        return reRepo.getOne(email);
    }
}
