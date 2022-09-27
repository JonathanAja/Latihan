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
public class MatkulAmbilScreen {
    public MatkulAmbilScreen(){
        Controller controller = new Controller();
        String nim = JOptionPane.showInputDialog("Masukkan NIM user yang dicari :");
        JOptionPane.showMessageDialog(null,controller.printMatkulAmbil(nim));
    }
}
