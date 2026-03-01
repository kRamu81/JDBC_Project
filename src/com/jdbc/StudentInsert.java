package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentInsert {

    public static void main(String[] args) {

        try {
            // 1️ Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️ Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbcConnection",
                    "root",
                    "1234"
            );

            // 3️ SQL Insert Query
            String sql = "INSERT INTO student(name,email,course) VALUES(?,?,?)";

            // 4️ Prepare Statement
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Anita");
            ps.setString(2, "anita@gmail.com");
            ps.setString(3, "Spring Boot");

            // 5️ Execute
            int rows = ps.executeUpdate();

            System.out.println("Rows inserted: " + rows);
            System.out.println("Data Inserted Successfully ✅");

            // 6️ Close Connection
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}