/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Connexion {
    
    public static Connection connectOdb() throws IOException{
        System.out.println("-----> Oracle JDBC Connection Testing");
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("???ERROR???");
        }
        
        System.out.println("-----> Oracle JDBC Driver Registered !");
        
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vlaroche","equipe01");
        } catch (SQLException e) {
            System.out.println("???Connection???Failed???");
        }
        
        if (connection != null) {
            System.out.println("-----> Connection To Oracle Created");
        } else {
            System.out.println("-----> Connection To Oracle Failed");
        }
        return connection;
    }
}