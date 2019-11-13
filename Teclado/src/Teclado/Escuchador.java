/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclado;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
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
       JButtonT aux = (JButtonT) e.getSource();
       Random rand = new Random();
       float r = rand.nextFloat(); float g = rand.nextFloat(); float b = rand.nextFloat();
       Color randomColor = new Color(r, g, b);
       
       if (aux.getText().equals("1")){
        //aux.setBackground(java.awt.Color.yellow);
        aux.setBackground(randomColor);
       }
       if (aux.getText().equals("2")){
           aux.setBackground(randomColor);
       }
       if (aux.getText().equals("3")){
            aux.setBackground(randomColor);
       }
       if (aux.getText().equals("4")){
            aux.setBackground(randomColor);
       }
       if (aux.getText().equals("5")){
            aux.setBackground(randomColor);
       }
       if (aux.getText().equals("6")){
          aux.setBackground(randomColor);
       }
       if (aux.getText().equals("7")){
           aux.setBackground(randomColor);
       }
       if (aux.getText().equals("8")){
            aux.setBackground(randomColor);
       }
       if (aux.getText().equals("9")){
            aux.setBackground(randomColor);
       }
       if (aux.getText().equals("0")){
            aux.setBackground(randomColor);
       }

    }
    
}