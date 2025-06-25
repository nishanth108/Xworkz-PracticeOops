package com.xworkz.general.repo;

import com.xworkz.general.dto.RegisterDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ValidateRepoImpl implements ValidateRepo{

    @Override
    public boolean save(RegisterDto registerDto) {
        System.out.println("Running Repo ");
        try {
            System.out.println("inside the Repo Class");
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/userdetails";
            String userName="root";
            String password ="nishanth@18";

            Connection connection =DriverManager.getConnection(url,userName,password);
            String sql = "insert into userdata values(0,'"+registerDto.getName()+"','"+registerDto.getEmail()+"',"+registerDto.getPhoneNo()+",'"+registerDto.getReligion()+"',"+
                    registerDto.getAge()+",'"+registerDto.getPassword()
                    +"')";
            Statement statement =connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println(connection);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
