/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


/**
 *
 * @author Alumno
 */
public class ListenerWhite implements ActionListener {

    private Display display;

    public ListenerWhite(Display display) {
        this.display = display;
    }
     
    
    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonC aux = (JButtonC) e.getSource();
         if (aux.getText().equals("+/-")){
          if(display.getNumero().isNegativo()){
              display.getNumero().setNegativo(false);
          }else{
              display.getNumero().setNegativo(true);
              
          }
         display.setText(display.getNumero().getValue()+"");
         System.out.println(display.getNumero().getValue());
       }else{
         display.concatenar(aux.getText());
       }

    }
   
}
