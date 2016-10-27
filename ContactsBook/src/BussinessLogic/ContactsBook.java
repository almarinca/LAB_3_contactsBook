package BussinessLogic;

import Data.Contact;
import static UI.ContactBookUI.*;
import java.util.ArrayList;

public class ContactsBook {

    static ArrayList<Contact> listaContactos = new ArrayList<>();

    public static void main(String[] args) {

        boolean salir = false;

        bienvenida();
        while (!false) {

            printMenu();
            int menu = leerInt();
            switch (menu) {
                case 1:
                    listaContactos.add(addContact());
                    break;
            }
        }
    }

    public static Contact addContact() {
        boolean salir = false;
        printNombre();
        String apellido = null;
        ArrayList<String> correo = new ArrayList<>();
        int fijo = 0;
        long movil = 0;
        String direccion = null;

        String nombre = leerString();
        for (int i = 0; i < 10; i++) {
            String a = String.valueOf(i);
            if (nombre.contains(a)) {
                printError();
                salir = true;
                break;
            } else if (nombre.length() < 3 || nombre.length() > 10) {
                printError();
                salir = true;
                break;
            }
        }
        if (!salir) {
            printValorCorrecto();
            printApellido();
            apellido = leerString();
            for (int i = 0; i < 10; i++) {
                String a = String.valueOf(i);
                if (apellido.contains(a)) {
                    printError();
                    salir = true;
                    break;
                } else if (apellido.length() < 3 || apellido.length() > 10) {
                    printError();
                    salir = true;
                    break;
                }
            }
        }
        if (!salir) {
            printValorCorrecto();
            printCorreo();
            correo.add(leerString());
            System.out.println(correo.size());
            if (correo.get(0).contains("@") && correo.get(0).contains(".")) {
                if (correo.get(0).length() < 11 || correo.get(0).length() > 25) {
                    printValorCorrecto();
                } else {
                    printError();
                    salir = true;
                }
            } else {
                printError();
                salir = true;
            }
        }
        if (!salir) {
            printFijo();
            fijo = leerInt();
            if (fijo < 1000000 || fijo > 9999999) {
                printError();
                salir = true;
            } else {
                printValorCorrecto();
            }
        }
        if (!salir) {
            printMovil();
            movil = leerLong();
            long a = 999999999;
            if (movil < 1000000000 || movil > a) {
                printError();
                salir = true;
            } else {
                printValorCorrecto();
            }
        }
        if (!salir) {
            printDireccion();
            direccion = leerString();
            if (direccion.length() < 10 || direccion.length() > 30) {
                printError();
                salir = true;
            } else {
                printValorCorrecto();
            }
        }
        if (!salir) {
            Contact nuevoContacto = new Contact(nombre, apellido, correo, fijo, movil, direccion);
            return nuevoContacto;
        } else {
            return null;
        }
    }

}
