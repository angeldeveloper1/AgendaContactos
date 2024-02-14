package com.proyecto6;

import java.util.Scanner;

// Clase principal (main) para ejecutar la aplicación de agenda de contactos
public class Main {

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Crear un objeto AgendaDeContactos para manejar la lista de contactos
        AgendaDeContactos listaContactos = new AgendaDeContactos(sc);

        // Variable para controlar el bucle de ejecución del programa
        boolean condicion = true;
        // Bucle principal que ejecuta el menú de la agenda de contactos
        while (condicion) {
            // Mostrar el menú de opciones
            System.out.println("Agenda de Contactos");
            System.out.println("1. Agregar contactos");
            System.out.println("2. Eliminar contactos");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Buscar contactos");
            System.out.println("5. Actualizar contactos");
            System.out.println("0. Salir");

            // Verificar si se ha ingresado un entero como opción
            if (sc.hasNextInt()) {

                // Leer la opción ingresada por el usuario
                int opcion = sc.nextInt();
                sc.nextLine();

                // Verificar si la opción ingresada está dentro del rango válido
                if (opcion < 0 || opcion > 5) {
                    System.out.println("Debe ingresar una de las opciones que se muestra en pantalla");
                }

                // Realizar acciones según la opción seleccionada por el usuario
                if (opcion == 0) {
                    System.out.println("Saliendo...");
                    System.out.println("Hasta luego!");
                    condicion = false; // Salir del bucle y terminar el programa
                }

                if (opcion == 1) {
                    listaContactos.agregarContacto(); // Agregar un nuevo contacto
                }
                if (opcion == 2) {
                    listaContactos.eliminarContacto(); // Eliminar un contacto existente
                }
                if (opcion == 3) {
                    listaContactos.mostrarAgenda(); // Mostrar todos los contactos en la agenda
                }
                if (opcion == 4) {
                    listaContactos.buscarContacto(); // Buscar un contacto por su ID
                }
                if (opcion == 5) {
                    listaContactos.actualizarContacto(); // Actualizar los datos de un contacto
                }
                System.out.println(); // Agregar una línea en blanco para mejorar la presentación
            } else {
                // Manejar la situación en la que se ingresa una letra o un carácter en lugar de un número como opción
                System.out.println("No se permite ingresar letras o caracteres. Ingrese una de las opciones que se muestra en pantalla");
                sc.next(); // Limpiar la entrada no válida
            }
        }
    }
}