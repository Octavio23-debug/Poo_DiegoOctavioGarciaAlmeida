/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.util.Scanner;


/**
 *
 * @author Alumno
 * Atributos
 */
public class Caja {
    private int ancho;
    private int alto;
    private int profundidad;
   private int volumen;
    
  /**constructor default
   */
   public Caja ()
  {
      ancho = 0;
      alto = 0;
      profundidad = 0;
  }  
  /**constructor 2
   */
  public Caja(int ancho, int alto, int profundidad ){
        this.ancho= ancho;
        this.alto= alto;
        this.profundidad=profundidad;    
    }
  /** Metodos
   */
    public  void volumen(){
    
      Scanner reader = new Scanner(System.in);
  double arista;
  double volumen;
 
  System.out.println("Introduce el valor de la arista del cubo");
  arista = reader.nextDouble();
        
  volumen = Math.pow(arista, 3);
  System.out.println("El volumen de un cubo de arista " 
          + Double.toString(arista) + " es de " + Double.toString(volumen));
  reader.close();
    } 
public int getVolumen(int volumen)
{
    return volumen;
}
    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }

    /**
     * @return the profundidad
     */
    public int getProfundidad() {
        return profundidad;
    }

    /**
     * @param profundidad the profundidad to set
     */
    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
