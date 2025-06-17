package com.Xwork.form;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/formSumbition",loadOnStartup = 1)
public class FormServlet extends GenericServlet {

    public FormServlet() {
        System.out.println("Tomcat is created Object");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running  serive in FormSerlet");

        RequestDispatcher requestDispatcher
                = servletRequest.getRequestDispatcher("formSumbition.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
        
    }
}
