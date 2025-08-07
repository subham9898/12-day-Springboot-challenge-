package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    static Connection con;

    public static Connection createC() {
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/student?useSSL=false&serverTimezone=UTC";

            con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ MySQL connection established.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
