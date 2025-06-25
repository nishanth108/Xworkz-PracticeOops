package com.xworkz.general.servlet;


import com.xworkz.general.dto.RegisterDto;
import com.xworkz.general.service.ValidateForm;
import com.xworkz.general.service.ValidateFormImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/save" , loadOnStartup = 1)
public class ValidServlet extends HttpServlet {
    public ValidServlet() {
        System.out.println("Running const in servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("fullName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String religion = req.getParameter("religion");
        String age = req.getParameter("age");
        String password = req.getParameter("password");

        int userAge = Integer.parseInt(age);
        int phoneNumber = Integer.parseInt(phone);
        int  userPassword = Integer.parseInt(password);

        RegisterDto registerDto = new RegisterDto(name,email,phoneNumber,religion,userAge,userPassword);


        System.out.println(registerDto.toString());

        ValidateForm validateForm = new ValidateFormImpl();
        boolean result = validateForm.save(registerDto);
        System.out.println(result);




    }

}
