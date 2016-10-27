package UI;

import Data.Contact;
import java.util.Scanner;

public class ContactBookUI {
    
    static Scanner in = new Scanner(System.in);

    public static void printContact(Contact contact) {
        System.out.println(contact);
    }

    public static void bienvenida() {

    }

    public static void printMenu() {
        System.out.println("Seleccione una de las siguientes opciones:\n1) Agregar contacto\n"
                + "2) Eliminar contacto?\n3) Actualizar contacto\n4) Mostrar todos los contactos\n"
                + "5) Mostrar solo un contacto\n6) Salir");
    }

    public static int leerInt() {
        int a;
        String b = in.next();
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
            a = in.next();
        } catch (Exception e) {
            a = null;
        }
        return a;
    }
    
    public static long leerLong() {
        long a;
        String b = in.next();
        try {
            a = Integer.valueOf(b);
        } catch (Exception e) {
            a = -1;
        }
        return a;
    }
    
    public static void printError(){
        System.out.println("Valor no válido, volviendo al menú");
    }
    
    public static void printValorCorrecto(){
        System.out.println("Valor ingresado correctamente");
    }
    
    public static void printNombre(){
        System.out.println("Por favor ingrese el nombre del nuevo contacto(no debe tener más de 10 caracteres)");
    }
    
    public static void printApellido(){
        System.out.println("Por favor ingrese el apellido del nuevo contacto(no debe tener más de 10 caracteres)");
    }
    
    public static void printCorreo(){
        System.out.println("Por favor ingrese el correo electrónico del nuevo contacto(debe tener un '@' y un '.')");
    }
    
    public static void printFijo(){
        System.out.println("Ingrese el número de teléfono fijo de su nuevo contacto");
    }
    
    public static void printMovil(){
        System.out.println("Ingrese el número de teléfono móvil de su nuevo contacto");
    }
    
    public static void printDireccion(){
        System.out.println("Ingrese la dirección de la residencia del nuevo contacto (no debe tener menos de 10 caracteres o más de 30)");
    }
}
