package com.wordpress.bmadi.belajar.koneksimysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MysqlKoneksi3 {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/belajar";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "java");
            
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, info);
            if (connection != null) {
                System.out.println("Connection Succes!");

            }

        } catch (Exception ex) {
            Logger.getLogger(MysqlKoneksi3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
