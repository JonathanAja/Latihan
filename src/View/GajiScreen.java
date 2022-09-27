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
public class GajiScreen {

    public GajiScreen() {
        Controller controller = new Controller();
        String nama = JOptionPane.showInputDialog("Masukkan nama user yang dicari :");
    }
}
