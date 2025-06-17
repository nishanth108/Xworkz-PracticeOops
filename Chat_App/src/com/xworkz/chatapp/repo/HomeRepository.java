package com.xworkz.chatapp.repo;

import com.xworkz.chatapp.dto.HomeDto;

public interface HomeRepository {
    boolean save(HomeDto homeDto);
}
