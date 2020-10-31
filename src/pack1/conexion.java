/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author master race
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
     private final String URL = "jdbc:mysql://localhost:3306/inventario";
     private final String USER = "root";
     private final String PASSWORD = ""; 
     
     public Connection cadena;
     
     public conexion(){
         this.cadena = null;  
     }
     public Connection conectarme(){
       try {
           Class.forName(DRIVER);
           this.cadena = DriverManager.getConnection (URL, USER,PASSWORD);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
       return this.cadena;             
}
     public void desconectarme () {
         try {
             this.cadena.close(); 
             }catch (Exception e) {
                 System.out.println(e.getMessage());
             }
         }
    
     }