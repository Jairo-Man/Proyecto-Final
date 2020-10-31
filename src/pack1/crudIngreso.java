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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.Conexion;


public class crudIngreso {
    
private PreparedStatement ps; 
private ResultSet rs; 
private boolean flag; 


public crudIngreso ( ){ 

} 
public boolean insertar (Object o ){
ingreso d = (ingreso) o; 
flag = false; 
Conexion c = new Conexion();
String query = "inserta into departamento (id_ingreso, cod_producto,descripcion,precio,fecha_ingreso,fecha_caducidad,stock,id_marca,id_proveedor,id_tipo)" + "values (?,?,?,?,?,?,?,?,?,?)"; 
try { 
     
    ps = c.conectarme ().prepareStatement(query);
    ps.setInt(1,2);
    ps.setInt(2,2);
    ps.setString (3,"");
    ps.setDouble(4,5);
    ps.setString(5,"");
    ps.setString(6,"");
    ps.setInt(7,7);
    ps.setInt(8,7);
    ps.setInt(9,9);
    ps.setInt(10,9);
    if(ps.executeUpdate()>0){
        flag=true;
    }
    ps.close();
    }   catch (Exception e) {  
        
        } finally{
    ps=null;
    c.desconectarme();
}

return flag;
}
}
