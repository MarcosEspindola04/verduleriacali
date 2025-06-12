/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Producto {
    private int codigo;
    private String nombre;
    private String rubro;
    private String unidad;
    private double precio;
    private double stock;

    // Constructor
public Producto(int codigo, String nombre, String rubro, String unidad, double precio, double stock) {
    
    this.codigo = codigo;
    this.nombre = nombre;
    this.rubro = rubro;
    this.unidad = unidad;
    this.precio = precio;
    this.stock = stock;
}
    // Getters y Setters
    public int getCodigo() { return codigo;}
    public String getNombre() { return nombre; }
    public String getRubro() { return rubro; }
    public String getUnidad() { return unidad; }
    public double getPrecio() { return precio; }
    public double getStock() { return stock; }

    
    public void setCodigo(int codigo) { this.codigo = codigo; }
    
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRubro(String rubro) { this.rubro = rubro; }
    public void setUnidad(String unidad) { this.unidad = unidad; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(double stock) { this.stock = stock; }
}
