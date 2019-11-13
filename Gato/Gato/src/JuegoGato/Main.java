/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoGato;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
    
    
    Tablero p=new Tablero();
    int U;
    int n1, n2;
    int kesimo=0;
    int iesimo=0;

    do
    {
      p.mostrarTablero();
      
    if(iesimo%2==0)
    {
        System.out.println("Turno del: JUGADOR X\n");
        do{
        System.out.print("Numero de renglon: ");
        n1=entrada.nextInt();
        System.out.print("Numero de columna: ");
        n2=entrada.nextInt();
        }while((n1<1 || n1>3) || (n2<1 || n2>3));
        kesimo=p.movimientoPrimerJ(n1, n2, kesimo);
    }
    else
    {
        System.out.println("Turno del: JUGADOR O\n");
        do{
        System.out.print("Numero de renglon: ");
        n1=entrada.nextInt();
        System.out.print("Numero de columna: ");
        n2=entrada.nextInt();
        }while((n1<1 || n1>3) || (n2<1 || n2>3));
        kesimo=p.movimientoSegundoJ(n1, n2, kesimo);
    }
    iesimo++;
    U=p.buscarGanador();
    }while (iesimo<9 && U==2);
    
    if (U==0)
     {
         System.out.println("Felicidades. Ganaste X!!\n");
       
     }
     else if (U==1){
        System.out.println("Felicidades. Ganaste O!!\n");
        
     }
    else
    {
        System.out.println("Han empatado :/\n");
     }

    }
}
