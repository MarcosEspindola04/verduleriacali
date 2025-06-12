/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Usuario {
    private int id;
    private String nombre;
    private String usuario;
    private String contraseña;
    private String rol;

    // Constructor
    public Usuario(int id, String nombre, String usuario, String contraseña, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getUsuario() { return usuario; }
    public String getContraseña() { return contraseña; }
    public String getRol() { return rol; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
    public void setRol(String rol) { this.rol = rol; }
}