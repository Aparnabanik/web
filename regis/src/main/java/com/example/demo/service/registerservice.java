package com.example.demo.service;

import com.example.demo.model.register;

import java.util.List;

public interface registerservice {
    public List<register> showall();
    public register getregisterbyid(String email);

}
