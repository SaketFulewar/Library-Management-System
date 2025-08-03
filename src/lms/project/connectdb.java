package lms.project;

import java.sql.*;
import javax.swing.JOptionPane;

public class connectdb {

    Connection conn;

    public static Connection ConnecrDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\OM\\Desktop\\Library Management System (LMS)\\LMS-Project\\lmsDatabase.db");
            System.out.println("DB Connected Succesfully");
            return conn;
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;

    }
}
