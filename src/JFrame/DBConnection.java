/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

/**
 *
 * @author Buket GİRGİNÇ
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con = null;

    public static Connection getConnection() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false", "root", "7894");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
