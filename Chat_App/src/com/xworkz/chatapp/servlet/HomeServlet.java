package com.xworkz.chatapp.servlet;

import com.xworkz.chatapp.dto.HomeDto;
import com.xworkz.chatapp.service.HomeService;
import com.xworkz.chatapp.service.HomeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/home",loadOnStartup = 1)
public class HomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName");
        String email = req.getParameter("userEmaile");
        String phone = req.getParameter("phone");
        String userAddress = req.getParameter("userAddress");
        String userAddhar = req.getParameter("userAddhar");
        String collegeName = req.getParameter("collegeName");
        String relationshipStatus = req.getParameter("relationshipStatus");
        String salary = req.getParameter("userSalary");

        //convertions
        int userSalary = Integer.parseInt(salary);
        int userPhone = Integer.parseInt(phone);

        System.out.println("User NAme is "+name);
        System.out.println("User email is is "+email);
        System.out.println("User phone is is "+userPhone);
        System.out.println("User userAddress is is "+userAddress);
        System.out.println("User userAddhar is is "+userAddhar);
        System.out.println("User collegeName is is "+collegeName);
        System.out.println("User relationshipStatus is is "+relationshipStatus);
        System.out.println("User userSalary is is "+userSalary);

        //Dtos
        HomeDto homeDto = new HomeDto();
        homeDto.setUserName(name);
        homeDto.setUserEmail(email);
        homeDto.setPhone(userPhone);
        homeDto.setUserAddhar(userAddress);
        homeDto.setUserAddhar(userAddhar);
        homeDto.setCollegeName(collegeName);
        homeDto.setRelationshipStatus(relationshipStatus);
        homeDto.setUserSalary(userSalary);


        System.out.println(homeDto.getUserName());
        System.out.println(homeDto.getUserEmail());
        System.out.println(homeDto.getPhone());
        System.out.println(homeDto.getUserAddress());
        System.out.println(homeDto.getUserAddhar());
        System.out.println(homeDto.getRelationshipStatus());
        System.out.println(homeDto.getCollegeName());
        System.out.println(homeDto.getUserSalary());

        HomeService homeService=new HomeServiceImpl();
      boolean saved=  homeService.saveHome(homeDto);
        System.out.println("Saved : "+saved);



    }
}
