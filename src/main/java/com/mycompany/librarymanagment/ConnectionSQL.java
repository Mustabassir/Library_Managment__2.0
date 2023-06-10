package com.mycompany.librarymanagment;

import java.sql.*;
import java.util.*;

public class ConnectionSQL {

    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    ConnectionSQL() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Employee_Detail;user=root;password=root;encrypt=true;trustServerCertificate=true");
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet executeQuery(String query) throws SQLException {
        rs = stmt.executeQuery(query);
        return rs;
    }
}
