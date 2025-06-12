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
    private int id;
    private String nombre;
    private String rubro;
    private String unidad;
    private double precio;
    private double stock;

    // Constructor
    public Producto(int id, String nombre, String rubro, String unidad, double precio, double stock) {
        this.id = id;
        this.nombre = nombre;
        this.rubro = rubro;
        this.unidad = unidad;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getRubro() { return rubro; }
    public String getUnidad() { return unidad; }
    public double getPrecio() { return precio; }
    public double getStock() { return stock; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRubro(String rubro) { this.rubro = rubro; }
    public void setUnidad(String unidad) { this.unidad = unidad; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(double stock) { this.stock = stock; }
}
