package com.xworkz.proj.repository;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.xworkz.proj.dto.BookStoreDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BookStoreRepositoryImplementation implements BookStoreRepository{


    @Override
    public String Save(BookStoreDTO bookStoreDTO) {
        System.out.println(" u r in  data base");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/bookstore";
                    String username = "xyz";
                    String password="xyzxyz";
            Connection connection = DriverManager.getConnection(url,username,password);
            String sql = "insert into booktable values (0,'"+bookStoreDTO.getName()+"',"+bookStoreDTO.getMobilenumber()+",'"+bookStoreDTO.getEmail()+"',"+bookStoreDTO.getBookid()+")";

            Statement statement = connection.createStatement();
            statement.execute(sql);

            System.out.println("connection " + connection);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "";
    }
}
