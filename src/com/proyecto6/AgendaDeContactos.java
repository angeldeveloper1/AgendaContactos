package com.proyecto6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaDeContactos {

    private static HashMap<Integer, Contacto> listaContactos = new HashMap<>();
    private static Scanner input;

    public AgendaDeContactos(Scanner input) {
        this.input = input;
    }

    // Agregar, Eliminar, Mostrar, Buscar, Actualizar
    public static void agregarContacto() {
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
        System.out.println("Ingrese el e-mail del contacto");
        String email = input.nextLine();
        Contacto contacto = new Contacto(nombre, apellido, edad, numeroTelefono, email);
        listaContactos.put(id, contacto);
        System.out.println("Se anadio el contacto correctamente.");
    }

    public static void eliminarContacto() {
        System.out.println("Ingrese el ID del contacto que desea eliminar");
        int id = input.nextInt();
        input.nextLine();
        if (listaContactos.containsKey(id)) {
            listaContactos.remove(id);
            System.out.println("Se elimino el contacto correctamente.");
        } else {
            System.out.println("El ID del contacto no existe.");
        }
    }

    public static void mostrarAgenda() {
        if (listaContactos.isEmpty()) {
            System.out.println("La agenda esta vacia.");
        } else {
            System.out.println("Contactos de la agenda: ");
            for (Map.Entry<Integer, Contacto> entrada : listaContactos.entrySet()) {
                System.out.println(entrada);
            }
        }
    }

    public static void buscarContacto() {
        System.out.println("Ingrese el ID del contacto que desea buscar");
        int id = input.nextInt();
        input.nextLine();
        if (listaContactos.containsKey(id)) {
            System.out.println("Contacto con ID " + id + ": ");
            System.out.println(listaContactos.get(id));
        } else {
            System.out.println("No se encuentra el contacto con ese ID");
        }
    }


}
