package UI;

import Data.Contact;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactBookUI {

    static Scanner in = new Scanner(System.in);

    public static void printContact(Contact contact) {
        System.out.println(contact);
    }

    public static void bienvenida() {
        System.out.println(
                "Bienvenido a libreta  de contactos" + "\n" + "");
    }

    public static void printMenu() {
        System.out.println("Seleccione una de las siguientes opciones:\n1) Agregar contacto\n"
                + "2) Eliminar contacto\n3) Actualizar contacto\n4) Mostrar todos los contactos\n"
                + "5) Mostrar solo un contacto\n6) Salir\n");
    }

    public static int leerInt() {
        int a;
        String b = in.nextLine();
        try {
            a = Integer.valueOf(b);
        } catch (Exception e) {
            a = -1;
        }
        return a;
    }

    public static String leerString() {
        String a;
        try {
            a = in.nextLine();
        } catch (Exception e) {
            a = null;
        }
        return a;
    }

    public static long leerLong() {
        long a;
        String b = in.nextLine();
        try {
            a = Long.valueOf(b);
        } catch (Exception e) {
            a = -1;
        }
        return a;
    }

    public static void printError() {
        System.out.println("Valor no válido, volviendo al menú\n");
    }

    public static void printValorCorrecto() {
        System.out.println("Valor ingresado correctamente\n");
    }

    public static void printAgregado(){
        System.out.println("Contacto agregado correctamente\n");
    }
    
    public static void printNombre() {
        System.out.println("Por favor ingrese el nombre del nuevo contacto(no debe tener más de 10 caracteres)\n");
    }

    public static void printApellido() {
        System.out.println("Por favor ingrese el apellido del nuevo contacto(no debe tener más de 10 caracteres)\n");
    }

    public static void printCorreo() {
        System.out.println("Por favor ingrese el correo electrónico del nuevo contacto(debe tener un '@' y un '.')\n");
    }

    public static void printFijo() {
        System.out.println("Ingrese el número de teléfono fijo de su nuevo contacto\n");
    }

    public static void printMovil() {
        System.out.println("Ingrese el número de teléfono móvil de su nuevo contacto\n");
    }

    public static void printDireccion() {
        System.out.println("Ingrese la dirección de la residencia del nuevo contacto (no debe tener menos de 10 caracteres o más de 30)\n");
    }

    public static void imprimirListaContactos(ArrayList<Contact> listaContactos) {
        System.out.println("\n Por favor seleccione uno de los contactos para realizar la acción. \n");
        int i=1;
        for (Contact contacto : listaContactos) {
            System.out.println(i++ +")" + contacto.getNombre()); 
        }
        System.out.println("\n 0) salir. \n");
    }
    
    public static void printBorrado(){
        System.out.println("Contacto eliminado correctamente\n");
    }
    
    public static void printActualizado(){
        System.out.println("El contacto fue actualizado correctamente\n");
    }
}
