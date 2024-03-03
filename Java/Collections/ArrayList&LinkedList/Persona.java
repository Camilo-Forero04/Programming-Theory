/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist.linkedlist;

/**
 *
 * @author PAVILION
 */
public class Persona {
    String nombre;
    int edad;
    String pais;
    Persona(String nombre, int edad, String pais){
        this.nombre=nombre;
        this.edad=edad;
        this.pais=pais;
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+" Edad: "+edad+" Pais: "+pais;
    }
}
