package UI;

import BussinessLogic.ContactsBook;
import Data.Contact;

public class ContactBookUI {
    
    
    public static void printContact(Contact contact) {
        System.out.println(contact);
    }
    
    public static void bienvenida () {
        
        System.out.println(
              
                "Bienvenido a libreta  de contactos" + "\n" + "");
        
    }
    
    public static void menuPrincipal() {
        System.out.println("\n Por favor seleccione una opción."                
                + "1) Agregar contacto" + "\n"
                + "2) Eliminar contacto" + "\n"
                + "3) Actualizar contacto" + "\n"
                + "4) Mostrar todos los contactos" + "\n"
                + "5) Mostrar un contacto" + "\n"               
                + "6) Salir" + "\n");        
    }
    
    public static void listaContactos() {
        System.out.println("\n Por favor seleccione uno de los contactos para realizar la acción. \n");  
        
        ContactsBook.printAllContacts();
        
        System.out.println("\n 0) salir. \n"); 
    }
    
}
