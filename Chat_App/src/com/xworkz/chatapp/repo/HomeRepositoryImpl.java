package com.xworkz.chatapp.repo;

import com.xworkz.chatapp.dto.HomeDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HomeRepositoryImpl implements HomeRepository {

    public boolean save(HomeDto homeDto) {
        System.out.println("running save in Repo...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/chatdetails";
            String userName = "root";
            String password = "nishanth@18";
            Connection connection=DriverManager.getConnection(url, userName, password);
            String sql = "insert into chatuser values(0,'"+homeDto.getUserName()+"','"+homeDto.getUserEmail()+"',"+homeDto.getPhone()+",'"+homeDto.getUserAddress()+"','"+
                    homeDto.getUserAddhar()+"','"+homeDto.getCollegeName()
                    +"','"+homeDto.getRelationshipStatus()+"',"+homeDto.getUserSalary()+")";
           Statement statement= connection.createStatement();
           statement.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);

        }

        return  false;
    }
}
