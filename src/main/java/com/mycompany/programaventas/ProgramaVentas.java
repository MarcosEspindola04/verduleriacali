
package com.mycompany.programaventas;

import java.util.*; // Para List y ArrayList
import javax.swing.SwingUtilities;

public class ProgramaVentas {

   

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.iniciar();
     
        
    }
}

// CONTROLADOR PRINCIPAL
class Sistema {
    private ProductoController productoController;
    private VentaController ventaController;
    private StockController stockController;

    public Sistema() {
        productoController = new ProductoController();
        ventaController = new VentaController();
        stockController = new StockController();
    }

    public void iniciar() {
       
        System.out.println("Sistema de Gestión Avícola - Iniciado");

       
}

// CONTROLADOR DE PRODUCTOS
class ProductoController {
    

    public List<Producto> getProductos;

    public void listarProductos() {
        
    }
}

// CONTROLADOR DE VENTAS
class VentaController {
   
}

// CONTROLADOR DE STOCK (vacío por ahora)
class StockController {
    // Control de entradas, salidas, ajuste de stock.
}

// ENTIDAD PRODUCTO
class Producto {
    private int id;
    private String nombre;
    private String categoria;
    private double precioVenta;
    private double stock;
    private String unidad;

    public Producto(int id, String nombre, String categoria, double precioVenta, double stock, String unidad) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.unidad = unidad;
    }

    public int getId() { return id; }
    public double getStock() { return stock; }
    public void setStock(double stock) { this.stock = stock; }
    public double getPrecioVenta() { return precioVenta; }
    public String getUnidad() { return unidad; }

    @Override
    public String toString() {
        return id + ". " + nombre + " - " + categoria + " - $" + precioVenta + " - Stock: " + stock + " " + unidad;
    }
}


}