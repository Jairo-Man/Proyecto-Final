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
public class ingreso {
    private int id_ingreso;
    private int cod_producto;
    private char descripcion;
    private double precio;
    private String Fingreso;
    private String Fcaducidad;
    private int stock;
    private int marca;
    private int proveedor;
    private int tipo;

    public ingreso() {
    }

    public ingreso(int id_ingreso, int cod_producto, char descripcion, double precio, String Fingreso, String Fcaducidad, int stock, int marca, int proveedor, int tipo) {
        this.id_ingreso = id_ingreso;
        this.cod_producto = cod_producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.Fingreso = Fingreso;
        this.Fcaducidad = Fcaducidad;
        this.stock = stock;
        this.marca = marca;
        this.proveedor = proveedor;
        this.tipo = tipo;
    }

    public int getId_ingreso() {
        return id_ingreso;
    }

    public void setId_ingreso(int id_ingreso) {
        this.id_ingreso = id_ingreso;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public char getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(char descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFingreso() {
        return Fingreso;
    }

    public void setFingreso(String Fingreso) {
        this.Fingreso = Fingreso;
    }

    public String getFcaducidad() {
        return Fcaducidad;
    }

    public void setFcaducidad(String Fcaducidad) {
        this.Fcaducidad = Fcaducidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
