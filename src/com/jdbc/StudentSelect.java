package com.jdbc;

import java.sql.*;

public class StudentSelect {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbcConnection",
                    "root",
                    "1234"
            );

            System.out.println("Connected Successfully ✅");

            String sql = "SELECT * FROM student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("email") + " " +
                        rs.getString("course")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}