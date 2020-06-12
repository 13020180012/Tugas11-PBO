
package com.magfira.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author ASUS-PC sitti azyyati tajuddin (13020180012)
 */
public class konfigurasi {
    
    private static Connection MySQLConfig;
    
    public static Connection configDB() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/latihanjavadatabase";
            String user="root";
            String pass=" ";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url,user,pass);
            
        }catch(SQLException e){
            System.out.println("koneksi ke Database gagal" + e.getMessage());
        }
        return MySQLConfig;
    } 
    
}
