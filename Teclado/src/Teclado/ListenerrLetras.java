/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclado;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Alumno
 */

public class  ListenerrLetras implements KeyListener{
    Random rand = new Random();
    float r = rand.nextFloat(); float g = rand.nextFloat(); float b = rand.nextFloat();
    Color randomColor = new Color(r, g, b);
    
    @Override
    public void keyTyped(KeyEvent e) {
        
       // System.out.println("KeyTyped "+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
       JButton aux = (JButton)e.getSource();
         String a = e.getKeyChar()+"";
         if(a.equals("q")){
         aux.setBackground(Color.red);
         }
        //System.out.println("KeyPressed "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JButton aux = (JButton)e.getSource();
         String a = e.getKeyChar()+"";
         if(a.equals("q")){
         aux.setBackground(Color.white);
         }
        //System.out.println("KeyReleased "+e.getKeyChar());
    }
    
}
