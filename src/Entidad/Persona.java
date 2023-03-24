/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Winsl
 */
public class Persona {
    public String nombre;
    private int edad;
    private int dni;
    private double altura;
    private double peso;
    

    public Persona(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
/*
    public void setEdad(int edad) {
        this.edad = edad;
    }
*/

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public Persona(String nombre){
        this.nombre=nombre;
    }
    public Persona(int edad,double altura){
        this.edad=edad;
        this.altura=altura;
    }
    public Persona(double peso,int dni){
        
    }
    
}
