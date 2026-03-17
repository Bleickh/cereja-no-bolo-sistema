package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cereja_no_bolo",
                    "root",
                    "Shikai@12");

            return conn;

        } catch (Exception e) {

            e.printStackTrace();
            return null;

        }

    }

}