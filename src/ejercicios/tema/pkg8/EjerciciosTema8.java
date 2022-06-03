/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.tema.pkg8;

/**
 *
 * @author Nicoaimar
 */

// Para practicar la encapsulación:

        //    1- Crear clase Persona. ✅
        //    2- Crear variables las privadas edad, nombre y telefono de la clase Persona. ✅
        //    3- Crear gets y sets de cada propiedad. ✅
        //    4- Crear un objeto persona en el main. ✅
        //    5- Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola. ✅

public class EjerciciosTema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setEdad(27);
        System.out.println("Edad: " + persona.getEdad() + " años");
        
        persona.setNombre("Nicolás");
        System.out.println("Nombre: " + persona.getNombre());
        
        persona.setTelefono(351666666);
        System.out.println("Telefono: " + persona.getTelefono());
        
    }
    
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public int getTelefono() {
        return this.telefono;
    }
    
}