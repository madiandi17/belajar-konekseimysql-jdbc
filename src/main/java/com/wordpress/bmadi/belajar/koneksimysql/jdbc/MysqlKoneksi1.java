package com.wordpress.bmadi.belajar.koneksimysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MysqlKoneksi1 {

    public static void main(String[] args) {
        Connection connection = null;
        try {

            String dbDriver = "com.mysql.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost/belajar";
            String dbUsername = "root";
            String dbPassword = "java";

            Class.forName(dbDriver);
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            if (connection != null) {
                System.out.println("Connection Succes!");

            }

        } catch (Exception ex) {
            Logger.getLogger(MysqlKoneksi1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
