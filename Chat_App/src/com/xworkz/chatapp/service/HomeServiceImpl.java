package com.xworkz.chatapp.service;

import com.xworkz.chatapp.dto.HomeDto;
import com.xworkz.chatapp.repo.HomeRepository;
import com.xworkz.chatapp.repo.HomeRepositoryImpl;

public class HomeServiceImpl implements HomeService{
    @Override
    public boolean saveHome(HomeDto homeDto) {
        //validation still pending
        if(homeDto!=null) {
            //Conecting to repo
            HomeRepository saveHOmeRepo=new HomeRepositoryImpl();
           boolean saved= saveHOmeRepo.save(homeDto);
            System.out.println("saved : "+saved);
            return saved;
        } else {
            System.out.println("dto is having null values");
        }
        return  false;
    }
}
