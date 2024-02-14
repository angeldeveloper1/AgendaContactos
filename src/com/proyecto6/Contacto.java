package com.proyecto6;
// Definición de la clase Contacto
public class Contacto {

    private int id;// Identificador único del contacto
    private String nombre;// Nombre del contacto
    private String apellido;// Apellido del contacto
    private int edad;// Edad del contacto
    private int numeroTelefono;// Número de teléfono del contacto
    private String email;// Correo electrónico del contacto
    // Constructor de la clase Contacto
    public Contacto(String nombre, String apellido, int edad, int numeroTelefono, String email) {
        // Inicialización de las variables miembro con los valores proporcionados
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
    }
    // Método getter para obtener el ID del contacto
    public int getId() {
        return id;
    }
    // Método setter para establecer el ID del contacto
    public void setId(int id) {
        this.id = id;
    }
    // Método getter para obtener el nombre del contacto
    public String getNombre() {
        return nombre;
    }
    // Método setter para establecer el nombre del contacto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Método getter para obtener el apellido del contacto
    public String getApellido() {
        return apellido;
    }
    // Método setter para establecer el apellido del contacto
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    // Método getter para obtener la edad del contacto
    public int getEdad() {
        return edad;
    }
    // Método setter para establecer la edad del contacto
    public void setEdad(int edad) {
        this.edad = edad;
    }
    // Método getter para obtener el número de teléfono del contacto
    public int getNumeroTelefono() {
        return numeroTelefono;
    }
    // Método setter para establecer el número de teléfono del contacto
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    // Método getter para obtener el correo electrónico del contacto
    public String getEmail() {
        return email;
    }
    // Método setter para establecer el correo electrónico del contacto
    public void setEmail(String email) {
        this.email = email;
    }
    // Método toString para obtener una representación en cadena del objeto Contacto
    @Override
    public String toString() {
        return "Nombre: " +nombre + "\nApellido: " +apellido + "\nEdad: " +edad + "\nNumero de telefono: " +numeroTelefono
                + "\nE-mail: " +email;
    }

}
