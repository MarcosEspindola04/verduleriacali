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
    private boolean activo; // nuevo
    private int codigo;
    private String nombre;
    private String rubro;
    private String unidad;
    private double precio;
    private double cantidad; // reemplaza a stock

    public Producto(int codigo, String nombre, String rubro, String unidad, double precio, double cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.rubro = rubro;
        this.unidad = unidad;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRubro() { return rubro; }
    public void setRubro(String rubro) { this.rubro = rubro; }

    public String getUnidad() { return unidad; }
    public void setUnidad(String unidad) { this.unidad = unidad; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public double getCantidad() { return cantidad; }
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }
}

