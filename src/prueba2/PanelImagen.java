/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Leidy Torres
 */
public class PanelImagen extends JPanel{
    
    private JLabel etiquetaImagen;
    
    public PanelImagen() {
        setBackground(Color.GRAY);
        setBorder(new LineBorder (Color.GRAY));
        ImageIcon icon = new ImageIcon(" ");
        etiquetaImagen = new JLabel();
        etiquetaImagen.setIcon(icon);
        
        add(etiquetaImagen);
   
}
    
}
