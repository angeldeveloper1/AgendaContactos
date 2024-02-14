package com.proyecto6;

public class Contacto {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int numeroTelefono;
    private String email;

    public Contacto(String nombre, String apellido, int edad, int numeroTelefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " +nombre + "\nApellido: " +apellido + "\nEdad: " +edad + "\nNumero de telefono: " +numeroTelefono
                + "\nE-mail: " +email;
    }

}
