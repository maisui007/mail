package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by hnair20160706 on 2016/8/6.
 */
public class SimpleServerStart {
    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.20.128:3306/db_email";
        String username = "email";
        String password = "email";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {

            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
