package Data;

import java.util.ArrayList;

public class Contact {
    
    private String nombre;
    private String apellido;
    private ArrayList<String> correoElectronico;
    private int telefonoFijo;
    private long telefonoMovil;
    private String direccion;

    public Contact(String nombre, String apellido, ArrayList<String> correoElectronico, int telefonoFijo, long telefonoMovil, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + "\n"
                + "apellido:" + apellido + "\n"
                + "correoElectronico:" + correoElectronico + "\n"
                + "telefonoFijo:" + telefonoFijo + "\n"
                + "telefonoMovil:" + telefonoMovil + "\n"
                + "direccion:" + direccion + "\n";
    }
    
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<String> getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(ArrayList<String> correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(int telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public long getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(int telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
