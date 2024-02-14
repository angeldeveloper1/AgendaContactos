package com.proyecto6;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

// Definición de la clase AgendaDeContactos
public class AgendaDeContactos {

    // HashMap para almacenar los contactos, con clave: ID del contacto y valor: Objeto Contacto
    private static HashMap<Integer, Contacto> listaContactos = new HashMap<>();
    // Scanner para la entrada de usuario
    private static Scanner input;

    // Constructor de la clase AgendaDeContactos
    public AgendaDeContactos(Scanner input) {
        this.input = input;
    }

    // Método para agregar un nuevo contacto a la agenda
    public static void agregarContacto() {
        try {
            // Solicitar y leer los datos del nuevo contacto desde la entrada del usuario
            System.out.println("Ingrese el ID del contacto");
            int id = input.nextInt();
            input.nextLine();
            System.out.println("Ingrese el nombre del contacto");
            String nombre = input.nextLine();
            System.out.println("Ingrese el apellido del contacto");
            String apellido = input.nextLine();
            System.out.println("Ingrese la edad del contacto");
            int edad = input.nextInt();
            input.nextLine();
            System.out.println("Ingrese el numero de telefono del contacto");
            int numeroTelefono = input.nextInt();
            input.nextLine();
            System.out.println("Ingrese el e-mail del contacto");
            String email = input.nextLine();
            // Crear un nuevo objeto Contacto con los datos proporcionados
            Contacto contacto = new Contacto(nombre, apellido, edad, numeroTelefono, email);
            // Agregar el contacto al HashMap listaContactos
            listaContactos.put(id, contacto);
            System.out.println("Se anadio el contacto correctamente.");
        } catch (InputMismatchException e) {
            // Manejar la excepción en caso de que los datos ingresados no sean del tipo esperado
            System.out.println("Ocurrio algo al ingresar los datos, intente nuevamente verificando bien los datos.");
            input.next();
        }

    }

    // Método para eliminar un contacto de la agenda
    public static void eliminarContacto() {
        try {
            // Solicitar y leer el ID del contacto a eliminar
            System.out.println("Ingrese el ID del contacto que desea eliminar");
            int id = input.nextInt();
            input.nextLine();
            // Verificar si el contacto con ese ID existe en la agenda y eliminarlo si es así
            if (listaContactos.containsKey(id)) {
                listaContactos.remove(id);
                System.out.println("Se elimino el contacto correctamente.");
            } else {
                System.out.println("El ID del contacto no existe.");
            }
        } catch (InputMismatchException e) {
            // Manejar la excepción en caso de que los datos ingresados no sean del tipo esperado
            System.out.println("Ocurrio algo al ingresar los datos, intente nuevamente verificando bien los datos.");
            input.next();
        }
    }

    // Método para mostrar todos los contactos en la agenda
    public static void mostrarAgenda() {
        // Verificar si la agenda está vacía y mostrar un mensaje apropiado, de lo contrario, mostrar los contactos
        if (listaContactos.isEmpty()) {
            System.out.println("La agenda esta vacia.");
        } else {
            System.out.println("Contactos de la agenda: ");
            for (Contacto contacto : listaContactos.values()) {
                System.out.println(contacto);
                System.out.println();
            }
        }
    }

    // Método para buscar un contacto por su ID
    public static void buscarContacto() {
        try {
            // Solicitar y leer el ID del contacto a buscar
            System.out.println("Ingrese el ID del contacto que desea buscar");
            int id = input.nextInt();
            input.nextLine();
            // Verificar si el contacto con ese ID existe en la agenda y mostrarlo si es así
            if (listaContactos.containsKey(id)) {
                System.out.println("Contacto con ID " + id + ": ");
                System.out.println(listaContactos.get(id));
            } else {
                System.out.println("No se encuentra el contacto con ese ID");
            }
        } catch (InputMismatchException e) {
            // Manejar la excepción en caso de que los datos ingresados no sean del tipo esperado
            System.out.println("Ocurrio algo al ingresar los datos, intente nuevamente verificando bien los datos.");
            input.next();
        }
    }

    // Método para actualizar los datos de un contacto
    public static void actualizarContacto() {
        try {
            // Solicitar y leer el ID del contacto a actualizar
            System.out.println("Ingrese el ID del contacto que desea actualizar");
            int id = input.nextInt();
            input.nextLine();
            // Verificar si el contacto con ese ID existe en la agenda y actualizar sus datos si es así
            if (listaContactos.containsKey(id)) {
                Contacto contacto = listaContactos.get(id);
                System.out.println("Que desea actualizar del contacto con el ID: " + id);
                System.out.println("1. Nombre");
                System.out.println("2. Apellido");
                System.out.println("3. Edad");
                System.out.println("4. Numero De Telefono");
                System.out.println("5. E-mail");
                int opcion = input.nextInt();
                input.nextLine();

                // Según la opción seleccionada por el usuario, actualizar el atributo correspondiente del contacto
                if (opcion == 1) {
                    System.out.println("Actualice el nombre");
                    String nombre = input.nextLine();
                    contacto.setNombre(nombre);
                    System.out.println("El nombre ha sido actualizado.");
                }
                if (opcion == 2) {
                    System.out.println("Actualice el apellido");
                    String apellido = input.nextLine();
                    contacto.setApellido(apellido);
                    System.out.println("El apellido ha sido actualizado.");
                }
                if (opcion == 3) {
                    System.out.println("Actualice la edad");
                    int edad = input.nextInt();
                    input.nextLine();
                    contacto.setEdad(edad);
                    System.out.println("La edad ha sido actualizado.");
                }
                if (opcion == 4) {
                    System.out.println("Actualice el numero de telefono");
                    int numeroTelefono = input.nextInt();
                    input.nextLine();
                    contacto.setNumeroTelefono(numeroTelefono);
                    System.out.println("EL numero de telefono ha sido actualizado.");
                }
                if (opcion == 5) {
                    System.out.println("Actualice el e-mail");
                    String email = input.nextLine();
                    contacto.setEmail(email);
                    System.out.println("El email ha sido actualizado.");
                }

            } else {
                System.out.println("No existe ningun contacto con ese ID.");
            }
        } catch (InputMismatchException e) {
            // Manejar la excepción en caso de que los datos ingresados no sean del tipo esperado
            System.out.println("Ocurrio algo al ingresar los datos, intente nuevamente verificando bien los datos.");
            input.next();
        }
    }

}