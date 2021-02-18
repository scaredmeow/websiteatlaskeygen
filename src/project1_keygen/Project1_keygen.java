/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1_keygen;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Other
 */
public class Project1_keygen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("de.javasoft.synthetica.simple2d.SyntheticaSimple2DLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Project1_keygen.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        java.awt.EventQueue.invokeLater(() -> {
            new keygenMain().setVisible(true);
        });
    }
    
}
