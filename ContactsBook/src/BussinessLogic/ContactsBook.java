package BussinessLogic;

import Data.Contact;
import static UI.ContactBookUI.*;
import java.util.ArrayList;

public class ContactsBook {

    static ArrayList<Contact> listaContactos = new ArrayList<>();

    public static void main(String[] args) {

        boolean salir = false;

        bienvenida();
        while (!salir) {

            printMenu();
            int menu = leerInt();
            switch (menu) {
                case 1:
                    Contact nuevo = addContact();
                    if (nuevo != null) {
                        listaContactos.add(nuevo);
                        printAgregado();
                        printContact(nuevo);
                    }
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    printAllContacts();
                    break;
                case 5:
                    printContactKeys();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    printError();
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
            if (correo.get(0).contains("@") && correo.get(0).contains(".")) {
                if (correo.get(0).length() < 11 || correo.get(0).length() > 25) {
                    printError();
                    salir = true;
                } else {
                    printValorCorrecto();
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
            if (movil < 1000000000L || movil > 9999999999L) {
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

    public static void removeContact() {
        imprimirListaContactos(listaContactos);
        int contact = leerInt();
        try {
            listaContactos.remove(contact - 1);
            printBorrado();
        } catch (IndexOutOfBoundsException e) {
            printError();
        }
    }

    public static void updateContact() {
        imprimirListaContactos(listaContactos);
        int contact = leerInt();
        if (contact > 0 && contact <= listaContactos.size()) {
            Contact cont = addContact();
            if (cont != null) {
                listaContactos.set(contact - 1, cont);
                printActualizado();
            }
        } else if (contact == 0) {

        } else {
            printError();
        }
    }

    public static void printAllContacts() {
        for (Contact contacto : listaContactos) {
            printContact(contacto);
        }
    }

    public static void printContactKeys() {

        imprimirListaContactos(listaContactos);

        int opcion = leerInt();

        try {
            printContact(listaContactos.get(opcion - 1));
        } catch (IndexOutOfBoundsException e) {
            if (opcion != 0) {
                printError();
            }
        }
    }

}
