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
public class JamDosenScreen {
    public JamDosenScreen(){
        Controller controller = new Controller();
        String nik = JOptionPane.showInputDialog("Masukkan nik dosen yang dicari :");
        JOptionPane.showMessageDialog(null," ");
    }
}
