/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Escuchador implements ActionListener{
    
   //private Display display;
   private int display;

    public Escuchador(int display) {
        this.display = display;
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
       JButtonC aux = (JButtonC) e.getSource();
       
       if (aux.getText().equals("1")){
          JOptionPane.showMessageDialog(null, "Operacion realizada correctamente");
          
       }
       if (aux.getText().equals("2")){
           String respuesta;
          respuesta=JOptionPane.showInputDialog("Escribe tu nombre","inserte aqui");
          aux.setText(respuesta);
       }
       if (aux.getText().equals("3")){
            String[] carreras = {
            "Ingeniería en sistemas computacionales",
            "Ingeniería en Mecatronica",
            "Ingeniería en Alimentos",
            "Ingeniería en Ambientales",
            "Ingeniería Metalurgica"
        };
        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, null, carreras, carreras[0]);       
        aux.setText(resp);
       }
       if (aux.getText().equals("4")){
            int resp;
           resp=JOptionPane.showConfirmDialog(null, "No se"); 
           
       }
       if (aux.getText().equals("5")){
            String[] options = {"Opcion A", "Opcion B", "Opcion C", "Opcion D"};
            int seleccion = JOptionPane.showOptionDialog(null, "NO es necesario que seleccione una opcion, ya que no hace nada -(:v)/-", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);       
            
       }

    }
    
}