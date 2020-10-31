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
public class test {
     public static void main(String[] args) {
         conexion c = new conexion();
    c.conectarme();
    
  if(c.cadena!=null){
      System.out.println("EXITO");
  } else {
      System.out.println ("NO HAY CONEXION DISPONIBLE");
  }
    
    
    }
     }
    
  
