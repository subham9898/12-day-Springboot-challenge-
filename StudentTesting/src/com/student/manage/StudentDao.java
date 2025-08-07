package com.student.manage;

import java.sql.Connection; // DB connection class
import java.sql.PreparedStatement; // Student class

public class StudentDao {
    public static boolean insertStudenttoDB(Student st) {
        boolean f = false;

        try {
            Connection con = CP.createC(); // Create connection using CP class
            if (con == null) {
                System.out.println("Failed to create connection.");
                return f; // Return false if connection is not established
            }
            String query = "INSERT INTO students(sname, sphone, scity) VALUES (?, ?, ?)";

            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());

            pstmt.executeUpdate();
            f = true;
            System.out.println("✅ Student added successfully to the database");
        } catch (Exception e) {
            e.printStackTrace();  // Shows error if any
        }

        return f; // ✅ MUST return boolean value
    }
}
