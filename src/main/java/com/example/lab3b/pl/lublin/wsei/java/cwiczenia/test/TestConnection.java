package com.example.lab3b.pl.lublin.wsei.java.cwiczenia.test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;
public class TestConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String serverName = "localhost";
        String database = "mydlo";
        Number portNumber = 3306;
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "12345678");
        connectionProps.put("serverTimezone", "Europe/Warsaw");

        conn = DriverManager.getConnection("jdbc:mysql://" + serverName + ":" + portNumber + "/"+ database, connectionProps);
    System.out.println("Connected to database");
    }
}