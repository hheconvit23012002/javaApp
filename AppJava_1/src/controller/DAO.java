/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
 
public class DAO {
    protected static Connection con;//declare the connection
     
    //constructor
    public DAO(){
        if(con == null){
            String dbUrl = "jdbc:mysql://localhost:3306/userapp";
            String dbClass = "com.mysql.cj.jdbc.Driver";

            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection (dbUrl, "root", "230102");
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
