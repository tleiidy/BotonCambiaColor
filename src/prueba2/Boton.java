/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Leidy Torres
 */
public class Boton extends JButton implements ActionListener, IMetodos {     

    /**
     * Constructor que inicializa las variables
     * @param posx
     * @param posy
     * @param ancho
     * @param alto 
     */
    public Boton( int posx, int posy, int ancho, int alto ){ 
        
        setBounds(posx, posy, ancho, alto);
        setBackground(java.awt.Color.WHITE);
        
        addActionListener( this );
    }
  

    public void actionPerformed( ActionEvent e ){        
        cambiarColor();
    }

    /**
     * Metodo que cambia de color los botones
     */
    @Override
    public void cambiarColor() {
        setBackground(Color.pink);
    }
    
    @Override
    public void generarBotones() {
        
    }

}
