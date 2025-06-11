/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.*;
import modelo.Usuario;

public class ControladoraLogin {

    public Usuario validarLogin(String usuarioInput, String passInput) {
        Usuario user = null;

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ventas_lodecali",
                "root",
                ""
            );

            String sql = "SELECT * FROM usuario WHERE usuario = ? AND contraseña = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuarioInput);
            ps.setString(2, passInput);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new Usuario(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("usuario"),
                    rs.getString("contraseña"),
                    rs.getString("rol")
                );
            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            System.err.println("Error al validar login: " + e.getMessage());
        }

        return user;
    }
}