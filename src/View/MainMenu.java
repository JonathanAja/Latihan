/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author shyen
 */
public class MainMenu {

    public MainMenu() {
        showMainMenu();
    }

    private void showMainMenu() {
        Boolean stat = true;
        while (stat) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Pilih Menu :"
                    + "\n 1.Print User Data"
                    + "\n 2.Print NA"
                    + "\n 3.Print NR"
                    + "\n 4.Print Mhs tdk Lulus"
                    + "\n 5.Print Matkul Ambil"
                    + "\n 6.Print Jam Dosen"
                    + "\n 7.Print Gaji "
                    + "\n 8. exit "));
            switch (menu) {
                case 1:
                    new UserDataScreen();
                    break;
                case 2:
                    new NilaiAkhirScreen();
                    break;
                case 3:
                    new NilaiRataScreen();
                    break;
                case 4:
                    new TidakLulusScreen();
                    break;
                case 5:
                    new MatkulAmbilScreen();
                    break;
                case 6:
                    new JamDosenScreen();
                    break;
                case 7:
                    new GajiScreen();
                    break;
                case 8:
                    stat = false;
                    break;
            }
        }
    }
}
