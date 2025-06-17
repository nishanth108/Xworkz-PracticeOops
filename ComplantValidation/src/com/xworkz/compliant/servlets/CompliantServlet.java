    package com.xworkz.compliant.servlets;

    import javax.servlet.GenericServlet;
    import javax.servlet.ServletException;
    import javax.servlet.ServletRequest;
    import javax.servlet.ServletResponse;
    import javax.servlet.annotation.WebServlet;
    import java.io.IOException;
    import java.io.PrintWriter;

    @WebServlet(urlPatterns = "/compliant",loadOnStartup = 1)
    public class CompliantServlet extends GenericServlet {

        CompliantServlet() {
            System.out.println("Tomcat just created the CompliantServlet object");
        }

        @Override
        public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

            String name = servletRequest.getParameter("name");
            String age = servletRequest.getParameter("age");
            String gender = servletRequest.getParameter("gender");
            String address = servletRequest.getParameter("address");
            String against = servletRequest.getParameter("against");
            String complaint = servletRequest.getParameter("complaint");

            int Nage = Integer.parseInt(age);

            System.out.println("Name: " + name +"age: "+Nage +"gender: "+gender+"address: "+address+"against: "+address+"complaint:"+complaint);

            PrintWriter writer = servletResponse.getWriter();
            writer.println("<html>");
            writer.println("<head>");

            writer.println("<body>");
            writer.println("<h1>");
            writer.println(name+"registered succesfully");
            writer.println("</h1>");
            writer.println("</body>");
            writer.println("</head>");

            writer.println("<html>");

        }
    }
