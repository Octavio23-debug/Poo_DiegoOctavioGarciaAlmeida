/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class CuadroDialogo extends JFrame{
    public CuadroDialogo() {
        inicializarBotones();
        
    }

    private void inicializarBotones() {
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(5,1));
        // creamos los botones
        
        Dimension dim = new Dimension(30,30);
        JButtonC btn1 = new JButtonC("1", dim, Color.CYAN);
        JButtonC btn2 = new JButtonC("2", dim, Color.CYAN);
        JButtonC btn3 = new JButtonC("3", dim, Color.CYAN);
        JButtonC btn4 = new JButtonC("4", dim, Color.CYAN);
        JButtonC btn5 = new JButtonC("5", dim, Color.CYAN);
        
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
       
        
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
        
        Escuchador orejon = new Escuchador(0);
        
        btn1.addActionListener(orejon);
        btn2.addActionListener(orejon);
        btn3.addActionListener(orejon);
        btn4.addActionListener(orejon);
        btn5.addActionListener(orejon);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
