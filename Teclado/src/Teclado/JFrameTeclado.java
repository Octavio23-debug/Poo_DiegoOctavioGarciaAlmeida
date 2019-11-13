/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class JFrameTeclado extends JFrame{
    public JFrameTeclado() {
        inicializarBotones();
        
    }

    private void inicializarBotones() {
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(4,11));
        JPanel flechas = new JPanel(new GridLayout(2,3));
        // creamos los botones
        
        Dimension dim = new Dimension(30,30);
        JButtonT btn1 = new JButtonT("1", dim, Color.cyan);
        JButtonT btn2 = new JButtonT("2", dim, Color.cyan);
        JButtonT btn3 = new JButtonT("3", dim, Color.cyan);
        JButtonT btn4 = new JButtonT("4", dim, Color.cyan);
        JButtonT btn5 = new JButtonT("5", dim, Color.cyan);
        JButtonT btn6 = new JButtonT("6", dim, Color.cyan);
        JButtonT btn7 = new JButtonT("7", dim, Color.cyan);
        JButtonT btn8 = new JButtonT("8", dim, Color.cyan);
        JButtonT btn9 = new JButtonT("9", dim, Color.cyan);
        JButtonT btn0 = new JButtonT("0", dim, Color.cyan);
        JButtonT btnNada = new JButtonT("-", dim, Color.cyan);
        
        JButtonT btnQ = new JButtonT("Q", dim, Color.cyan);
        JButtonT btnW = new JButtonT("W", dim, Color.magenta);
        JButtonT btnE = new JButtonT("E", dim, Color.magenta);
        JButtonT btnR = new JButtonT("R", dim, Color.magenta);
        JButtonT btnT = new JButtonT("T", dim, Color.magenta);
        JButtonT btnY = new JButtonT("Y", dim, Color.magenta);
        JButtonT btnU = new JButtonT("U", dim, Color.magenta);
        JButtonT btnI = new JButtonT("I", dim, Color.magenta);
        JButtonT btnO = new JButtonT("O", dim, Color.magenta);
        JButtonT btnP = new JButtonT("P", dim, Color.magenta);
        JButtonT btnA = new JButtonT("A", dim, Color.magenta);
        JButtonT btnS = new JButtonT("S", dim, Color.magenta);
        JButtonT btnD = new JButtonT("D", dim, Color.magenta);
        JButtonT btnF = new JButtonT("F", dim, Color.magenta);
        JButtonT btnG = new JButtonT("G", dim, Color.magenta);
        JButtonT btnH = new JButtonT("H", dim, Color.magenta);
        JButtonT btnJ = new JButtonT("J", dim, Color.magenta);
        JButtonT btnK = new JButtonT("K", dim, Color.magenta);
        JButtonT btnL = new JButtonT("L", dim, Color.magenta);
        JButtonT btnÑ = new JButtonT("Ñ", dim, Color.magenta);
        JButtonT btnZ = new JButtonT("Z", dim, Color.magenta);
        JButtonT btnX = new JButtonT("X", dim, Color.magenta);
        JButtonT btnC = new JButtonT("C", dim, Color.CYAN);
        JButtonT btnV = new JButtonT("V", dim, Color.CYAN);
        JButtonT btnB = new JButtonT("B", dim, Color.cyan);
        JButtonT btnN = new JButtonT("N", dim, Color.cyan);
        JButtonT btnM = new JButtonT("M", dim, Color.cyan);
        JButtonT btnArriba = new JButtonT("Arr", dim, Color.cyan);
        JButtonT btnAbajo = new JButtonT("ABa", dim, Color.cyan);
        JButtonT btnIzquierda = new JButtonT("Izq", dim, Color.cyan);
        JButtonT btnDerecha = new JButtonT("Dere", dim, Color.cyan);
        
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
        panelCentral.add(btn0);
        panelCentral.add(btnNada);
        
        
      panelCentral.add(btnQ); 
      
       panelCentral.add(btnW); 
       panelCentral.add(btnE); 
       panelCentral.add(btnR); 
       panelCentral.add(btnT); 
       panelCentral.add(btnY); 
       panelCentral.add(btnU); 
       panelCentral.add(btnI); 
       panelCentral.add(btnO); 
       panelCentral.add(btnP); 
       panelCentral.add(btnNada);
       
       panelCentral.add(btnA); 
       panelCentral.add(btnS); 
       panelCentral.add(btnD);
       panelCentral.add(btnF);
       panelCentral.add(btnG); 
       panelCentral.add(btnH); 
       panelCentral.add(btnJ); 
       panelCentral.add(btnK);
       panelCentral.add(btnL); 
       panelCentral.add(btnÑ);
       panelCentral.add(btnNada);
       
       panelCentral.add(btnZ); 
       panelCentral.add(btnX);
       panelCentral.add(btnC);
       panelCentral.add(btnV); 
       panelCentral.add(btnB);
       panelCentral.add(btnN); 
       panelCentral.add(btnM); 
       panelCentral.add(btnIzquierda); 
       panelCentral.add(btnArriba);
        panelCentral.add(btnAbajo);
       panelCentral.add(btnDerecha);
       
       
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
        setLocationRelativeTo(null);
                setMinimumSize(new Dimension(1500,450));
        Escuchador orejon = new Escuchador(0);
        ListenerrLetras orejon2 = new ListenerrLetras();
        
        btn1.addActionListener(orejon);
        btn2.addActionListener(orejon);
        btn3.addActionListener(orejon);
        btn4.addActionListener(orejon);
        btn5.addActionListener(orejon);
        btn6.addActionListener(orejon);
        btn7.addActionListener(orejon);
        btn8.addActionListener(orejon);
        btn9.addActionListener(orejon);
        btn0.addActionListener(orejon);
        
        btnQ.addKeyListener(orejon2);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
