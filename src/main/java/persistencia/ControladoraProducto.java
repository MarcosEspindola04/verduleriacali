/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Modelo.Producto;
import java.sql.*;
import java.util.*;

public class ControladoraProducto {

    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/ventas_lodecali", "root", ""
        );
    }

    public List<Producto> obtenerProductos() {
        List<Producto> lista = new ArrayList<>();
        try (Connection con = conectar()) {
            String sql = "SELECT * FROM producto WHERE activo = TRUE"; // Solo productos activos
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Producto p = new Producto(
                    rs.getInt("codigo"),
                    rs.getString("nombre"),
                    rs.getString("rubro"),
                    rs.getString("unidad"),
                    rs.getDouble("precio_venta"),
                    rs.getDouble("cantidad")
                );
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener productos: " + e.getMessage());
        }
        return lista;
    }

    public void guardarProducto(Producto p) {
        try (Connection con = conectar()) {
            String sql = "INSERT INTO producto (codigo, nombre, rubro, unidad, precio_venta, cantidad, activo) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getRubro());
            ps.setString(4, p.getUnidad());
            ps.setDouble(5, p.getPrecio());
            ps.setDouble(6, p.getCantidad());
            ps.setBoolean(7, true); // activo por defecto
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al guardar producto: " + e.getMessage());
        }
    }

    // Eliminación lógica
    public void eliminarProducto(int codigo) {
        try (Connection con = conectar()) {
            String sql = "UPDATE producto SET activo = FALSE WHERE codigo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al desactivar producto: " + e.getMessage());
        }
    }

    public void editarProducto(Producto p) {
        try (Connection con = conectar()) {
            String sql = "UPDATE producto SET nombre=?, rubro=?, unidad=?, precio_venta=?, cantidad=? WHERE codigo=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getRubro());
            ps.setString(3, p.getUnidad());
            ps.setDouble(4, p.getPrecio());
            ps.setDouble(5, p.getCantidad());
            ps.setInt(6, p.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al editar producto: " + e.getMessage());
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) {
        try (Connection con = conectar()) {
            String sql = "SELECT * FROM producto WHERE codigo = ? AND activo = TRUE";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Producto(
                    rs.getInt("codigo"),
                    rs.getString("nombre"),
                    rs.getString("rubro"),
                    rs.getString("unidad"),
                    rs.getDouble("precio_venta"),
                    rs.getDouble("cantidad")
                );
            }
        } catch (Exception e) {
            System.out.println("Error al buscar producto: " + e.getMessage());
        }
        return null;
    }
    
    
    public List<Producto> obtenerProductosInactivos() {
        List<Producto> lista = new ArrayList<>();
        try (Connection con = conectar()) {
            String sql = "SELECT * FROM producto WHERE activo = FALSE";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Producto p = new Producto(
                        rs.getInt("codigo"),
                        rs.getString("nombre"),
                        rs.getString("rubro"),
                        rs.getString("unidad"),
                        rs.getDouble("precio_venta"),
                        rs.getDouble("cantidad")
                );
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener productos inactivos: " + e.getMessage());
        }
        return lista;
    }

    public void restaurarProducto(int codigo) {
        try (Connection con = conectar()) {
            String sql = "UPDATE producto SET activo = TRUE WHERE codigo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al restaurar producto: " + e.getMessage());
        }
    }
}