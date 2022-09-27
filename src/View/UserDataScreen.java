/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.JOptionPane;
import controller.*;

/**
 *
 * @author shyen
 */
public class UserDataScreen {

    public UserDataScreen() {
        Controller controller = new Controller();
        String nama = JOptionPane.showInputDialog("Masukkan nama user yang dicari :");
        JOptionPane.showMessageDialog(null, "Status " + nama + "adalah " + controller.findUserData(nama));
    }
}
