/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

/**
 *
 * @author Leidy Torres
 */
public class Ventana extends JFrame implements ActionListener {
    private JPanel panelImagen;
    private JTextField Filas;
    private JTextField  Columnas;
    private JButton Crear;
    private JLabel leeFilas;
    private JLabel leeColumnas;
    private JPanel panel;
    
    /**
     * Contructor donde introduzco los elementos del JFrame
     */
    public Ventana() {

        JToolBar barra = new JToolBar();
                
	leeFilas = new JLabel();
	leeColumnas= new JLabel();
	Filas = new JTextField(); 
	Columnas = new JTextField(); 
		
	panel = new JPanel( null );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cambio De Color Botones");
        getContentPane().setLayout(new BorderLayout());
                
                
        panelImagen = new PanelImagen();
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        leeFilas.setText("Filas");
	barra.add(leeFilas);
	Filas.setPreferredSize(new Dimension(250, 25));
	barra.add(Filas);

        leeColumnas.setText("Columnas");
	barra.add(leeColumnas);

	Columnas.setPreferredSize(new Dimension(250, 25));
	barra.add(Columnas);
	Crear = new JButton("CREAR");
	Crear.addActionListener(this);
        barra.add(Crear);
	this.add(barra, BorderLayout.PAGE_END);
        this.add(panel, BorderLayout.CENTER);
        this.setSize(600, 600); 
	this.setLocationRelativeTo(null);
        setVisible(true);

    }
    
    public void actionPerformed( ActionEvent evt ) {
       generarBotones();
            
    }      
    
    /**
     * Metodo que genera matriz de botones
     */
    public void generarBotones(){
        String f = Filas.getText();
        String c = Columnas.getText();
        int filas = Integer.parseInt(f);
        int columnas = Integer.parseInt(c);
        panel.removeAll();
        
        Boton [][] botones = new Boton[ filas ][ columnas ];
        for( int fila = 0 ; fila < filas; fila++ ){
            for( int columna = 0 ; columna < columnas; columna++ ){ 
                botones[fila][columna] = new Boton( 100 * columna, 50 * fila, 100, 50 );
                panel.add( botones[fila][columna] );
            }
        }
	panel.updateUI();
    }

}
