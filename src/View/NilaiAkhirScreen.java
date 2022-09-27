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
public class NilaiAkhirScreen {
    public NilaiAkhirScreen(){
        Controller controller = new Controller();
        String NIM = JOptionPane.showInputDialog("Masukkan NIM yang dicari :");
        String kodeMK = JOptionPane.showInputDialog("Masukkan Kode MK yang dicari :");
        JOptionPane.showMessageDialog(null,"NA "+kodeMK+" = "+controller.hitungNA(NIM, kodeMK));
    }
}
