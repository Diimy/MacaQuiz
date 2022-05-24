package com.mycompany.macaquiz;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String usuario = "root";
    private static String senha = "ECA302";
    private static String host = "localhost";
    private static String porta = "3306";
    private static String bd = "bdmacaquiz";

    public static Connection obtemConexao() throws Exception {
        String url;
        url = String.format("jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC", host, porta, bd);
        return DriverManager.getConnection(url, usuario, senha);
    }
}