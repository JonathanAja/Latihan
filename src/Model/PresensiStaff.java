/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shyen
 */
public class PresensiStaff extends Presensi {
    private String jam;

    public PresensiStaff(String jam, int status, String tanggal) {
        super(status, tanggal);
        this.jam = jam;
    }



    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPresensiStaff{" + "jam=" + jam + '}';
    }

    
    
}
