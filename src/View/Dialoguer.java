/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Dialoguer {
    
    
    public static void message(Component component, String body){
        
        JOptionPane.showMessageDialog(component, body);
        
    }
}
