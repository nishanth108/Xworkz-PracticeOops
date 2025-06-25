package com.xworkz.general.service;

import com.xworkz.general.dto.RegisterDto;
import com.xworkz.general.repo.ValidateRepo;
import com.xworkz.general.repo.ValidateRepoImpl;

public class ValidateFormImpl implements ValidateForm{

    @Override
    public boolean save(RegisterDto registerDto) {
        if(registerDto!= null) {
//            connecting to repo
            System.out.println("service implimentation");
            ValidateRepo validateRepo = new ValidateRepoImpl();
            System.out.println("inside the Service page");
            boolean saved = validateRepo.save(registerDto);
            System.out.println("saved"+saved);
            return saved;
        } else {
            System.out.println("Dto haveing null values");
        }
        return false;
    }
}
