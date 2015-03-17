package com.wordpress.bmadi.belajar.koneksimysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MysqlKoneksi2 {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/belajar?user=root&password=java";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url);
            if (connection != null) {
                System.out.println("Connection Succes!");

            }

        } catch (Exception ex) {
            Logger.getLogger(MysqlKoneksi2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
