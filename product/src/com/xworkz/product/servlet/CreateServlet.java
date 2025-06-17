package com.xworkz.product.servlet;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.service.ProductService;
import com.xworkz.product.service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/form")
public class CreateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("userName");
        String password=req.getParameter("userPassword");
        System.out.println("CreateServlet class method"+name);
        System.out.println("CreateServlet class method"+password);

        ProductDto productDto=new ProductDto();
        productDto.setName(name);
        productDto.setPassword(password);
        ProductService service=new ProductServiceImpl();
        service.saveProduct(productDto);
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("Loged in succesful :"+name);

    }
}
