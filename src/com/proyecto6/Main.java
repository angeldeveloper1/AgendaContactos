package com.proyecto6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AgendaDeContactos listaContactos = new AgendaDeContactos(sc);

        boolean condicion = true;
        while (condicion) {
            System.out.println("Agenda de Contactos");
            System.out.println("1. Agregar contactos");
            System.out.println("2. Eliminar contactos");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Buscar contactos");
            System.out.println("5. Actualizar contactos");
            System.out.println("0. Salir");

            if (sc.hasNextInt()) {

                int opcion = sc.nextInt();
                sc.nextLine();

                if (opcion < 0 || opcion > 5) {
                    System.out.println("Debe ingresar una de las opciones que se muestra en pantalla");
                }

                if (opcion == 0) {
                    System.out.println("Saliendo...");
                    System.out.println("Hasta luego!");
                    condicion = false;
                }

                if (opcion == 1) {
                    listaContactos.agregarContacto();
                }
                if (opcion == 2) {
                    listaContactos.eliminarContacto();
                }
                if (opcion == 3) {
                    listaContactos.mostrarAgenda();
                }
                if (opcion == 4) {
                    listaContactos.buscarContacto();
                }
                if (opcion == 5) {
                    listaContactos.actualizarContacto();
                }
                System.out.println();
            } else {
                System.out.println("No se permite ingresar letras o caracteres. Ingrese una de las opciones que se muestra en pantalla");
                sc.next();
            }
        }
    }
}
