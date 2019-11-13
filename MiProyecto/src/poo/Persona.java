/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 * Crear objetos
 * @author Octavio23-debug
 */
public class Persona {
   String nombre;
   int edad;
   double estatura;
   double peso;
   String sexo;

    public Persona(String nombre, int edad, double estatura, double peso, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }
   
   public void saludar()
   {
       System.out.println("hello");
   }
 
           
}
