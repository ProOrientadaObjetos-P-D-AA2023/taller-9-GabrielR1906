/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author renat
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String username;
    
    public Persona() {
        this.nombre = "Renato G";
        this.apellido = "Rojas S";
        this.username = "Gabriel";
    }
    public Persona(String nombre, String apellido, String username) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
