/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Leidy Torres
 */
public abstract class Matriz implements IMetodos{
    private JPanel panelImagen;
    private JTextField Filas;
    private JTextField  Columnas;
    private JButton Crear;
    private JLabel leeFilas;
    private JLabel leeColumnas;
    private JPanel panel;
    
    /***
     * Constructor que inicializa las variables
     * @param panelImagen
     * @param Filas
     * @param Columnas
     * @param Crear
     * @param leeFilas
     * @param leeColumnas
     * @param panel 
     */
    public Matriz(JPanel panelImagen, JTextField Filas, JTextField Columnas, JButton Crear, JLabel leeFilas, JLabel leeColumnas, JPanel panel) {
        this.panelImagen = panelImagen;
        this.Filas = Filas;
        this.Columnas = Columnas;
        this.Crear = Crear;
        this.leeFilas = leeFilas;
        this.leeColumnas = leeColumnas;
        this.panel = panel;
    }
    
        
    @Override
    public void generarBotones(){
    }

    @Override
    public void cambiarColor() {

    }
}
