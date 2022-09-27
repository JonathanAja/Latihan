/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author shyen
 */
public class TidakLulusScreen {
    public TidakLulusScreen(){
        Controller controller = new Controller();
        String kodeMK = JOptionPane.showInputDialog("Masukkan kodeMK yang dicari :");
        JOptionPane.showMessageDialog(null,controller.tidakLulusMK(kodeMK));
    }
}
